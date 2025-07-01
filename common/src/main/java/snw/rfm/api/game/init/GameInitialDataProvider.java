package snw.rfm.api.game.init;

import lombok.NonNull;

import java.util.OptionalInt;

public interface GameInitialDataProvider {
    @NonNull OptionalInt getGameTime();

    @NonNull OptionalInt getHunterReleaseTime();

    boolean isNoStopWhenAllOut();

    boolean isStartTimerAfterHunterRelease();

    boolean isRecordingMode();

    Immutable toImmutable();

    interface Mutable extends GameInitialDataProvider {
        void setGameTime(Integer gameTime);

        void setHunterReleaseTime(Integer hunterReleaseTime);

        void setNoStopWhenAllOut(boolean noStopWhenAllOut);

        void setStartTimerAfterHunterRelease(boolean startTimerAfterHunterRelease);

        void setRecordingMode(boolean recordingMode);

        void copyFrom(GameInitialDataProvider other);
    }

    record Immutable(OptionalInt gameTime, OptionalInt hunterReleaseTime, boolean noStopWhenAllOut, boolean startTimerAfterHunterRelease, boolean recordingMode) implements GameInitialDataProvider {
        @Override
        public @NonNull OptionalInt getGameTime() {
            return gameTime();
        }

        @Override
        public @NonNull OptionalInt getHunterReleaseTime() {
            return hunterReleaseTime();
        }

        @Override
        public boolean isNoStopWhenAllOut() {
            return noStopWhenAllOut();
        }

        @Override
        public boolean isStartTimerAfterHunterRelease() {
            return startTimerAfterHunterRelease();
        }

        @Override
        public boolean isRecordingMode() {
            return recordingMode();
        }

        @Override
        public Immutable toImmutable() {
            return this;
        }
    }
}
