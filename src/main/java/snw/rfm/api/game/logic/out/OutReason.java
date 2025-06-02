package snw.rfm.api.game.logic.out;

public enum OutReason {
    CAUGHT,
    LOCATED,
    BULLETIN,
    SNITCH,
    ALARM
    ;

    public String translationKey() {
        return "rfm.out." + name().toLowerCase();
    }
}
