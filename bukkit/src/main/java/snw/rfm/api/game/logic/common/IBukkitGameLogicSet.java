package snw.rfm.api.game.logic.common;

import snw.rfm.api.game.logic.IGameLogicSet;
import snw.rfm.api.util.AtLeastOneElementStack;

public interface IBukkitGameLogicSet extends IGameLogicSet {
    AtLeastOneElementStack<PreventItemPickupCheck> getPreventItemPickupCheckStack();
}
