package snw.rfm.api.util;

import com.google.common.base.Preconditions;
import lombok.NonNull;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public final class AtLeastOneElementStack<T> {
    private final Deque<T> deque;

    public AtLeastOneElementStack() {
        this.deque = new ArrayDeque<>();
    }

    public T peek() {
        return Objects.requireNonNull(deque.peek(), "The stack have no element yet");
    }

    public void push(@NonNull T t) {
        deque.push(t);
    }

    public T pop() {
        Preconditions.checkState(deque.size() >= 2,
                "Must ensure the stack has at least one element after pop operation!");
        return deque.pop();
    }
}
