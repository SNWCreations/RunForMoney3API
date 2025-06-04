package snw.rfm.api.game.logic.out;

public enum OutReason {
    CAUGHT,
    CAUGHT_WITH_HUNTER_REMOVAL,
    LOCATED,
    BULLETIN,
    SNITCH,
    ALARM
    ;

    public String translationKey() {
        return "rfm.out." + name().toLowerCase();
    }
}
