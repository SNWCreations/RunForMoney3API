package snw.rfm.api.util.hook;

import lombok.NonNull;
import snw.rfm.api.game.pack.GamePack;
import snw.rfm.api.interfaces.Disposable;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public final class Hook<T> implements Disposable {
    private final Set<RegisteredHookHandler<T>> handlers = new HashSet<>();

    public Hook() {
        HookManager.allHooks.add(this);
    }

    public void hook(@NonNull GamePack registerer, @NonNull T handler) {
        final RegisteredHookHandler<T> registered = new RegisteredHookHandler<>(registerer, handler);
        handlers.add(registered);
    }

    public void runHooks(@NonNull Consumer<T> invoker) {
        for (RegisteredHookHandler<T> handler : handlers) {
            invoker.accept(handler.handler());
        }
    }

    @Override
    public void dispose() {
        handlers.clear();
        HookManager.allHooks.remove(this);
    }

    void disposeHandlersFrom(GamePack pack) {
        handlers.removeIf(t -> t.handle().equals(pack));
    }

    public static <T> Hook<T> create() {
        return new Hook<>();
    }

}
