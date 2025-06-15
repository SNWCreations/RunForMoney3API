package snw.rfm.api.game.init;

import lombok.NonNull;

import java.util.OptionalInt;

public interface GameInitialDataProvider {
    @NonNull OptionalInt getGameTime();

    @NonNull OptionalInt getHunterReleaseTime();

    boolean isNoStopWhenAllOut();

    boolean isStartTimerAfterHunterRelease();

    boolean isRecordingMode();

    void setGameTime(Integer gameTime);

    void setHunterReleaseTime(Integer hunterReleaseTime);

    void setNoStopWhenAllOut(boolean noStopWhenAllOut);

    void setStartTimerAfterHunterRelease(boolean startTimerAfterHunterRelease);

    void setRecordingMode(boolean recordingMode);
}
