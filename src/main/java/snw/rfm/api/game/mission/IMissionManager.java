package snw.rfm.api.game.mission;

import org.jetbrains.annotations.Nullable;
import snw.rfm.api.game.IGamePlayer;
import snw.rfm.api.game.pack.GamePack;

import java.util.function.Consumer;
import java.util.function.Predicate;

public interface IMissionManager {
    IMission registerMission(
            GamePack source,
            int atWhereInSeconds,
            @Nullable Integer endInSeconds,
            @Nullable Predicate<IGamePlayer> isCompleted,
            Consumer<IMission> startUp,
            Consumer<IMission> over
    );
}
