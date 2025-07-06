package snw.rfm.api.time;

public interface IHunterReleaseTimer extends ITimer {
    boolean isVisualOnly();

    void setVisualOnly(boolean visualOnly);
}
