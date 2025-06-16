package snw.rfm.api.game.launch;

import java.util.List;

public interface StartCondition {
    List<String> checkStartCondition();

    default void addMessageIf(boolean expr, String message, List<String> list) {
        if (expr) {
            list.add(message);
        }
    }
}
