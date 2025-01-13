package snw.rfm.api.game.logic;

import snw.rfm.api.game.IGame;
import snw.rfm.api.game.logic.caught.CaughtCondition;
import snw.rfm.api.game.logic.common.IsHunterCheck;
import snw.rfm.api.game.logic.common.IsTargetCheck;
import snw.rfm.api.game.logic.common.NotRunnerCheck;
import snw.rfm.api.game.logic.common.PreventItemPickupCheck;
import snw.rfm.api.game.logic.out.PlayerOutHandler;
import snw.rfm.api.game.logic.win.WinCondition;
import snw.rfm.api.util.AtLeastOneElementStack;

public interface IGameLogicSet {
    boolean evalWinCondition();

    IGame getGame();

    AtLeastOneElementStack<PlayerOutHandler> getPlayerOutHandlerStack();

    AtLeastOneElementStack<WinCondition> getWinConditionStack();

    AtLeastOneElementStack<CaughtCondition> getCaughtConditionStack();

    AtLeastOneElementStack<NotRunnerCheck> getNotRunnerCheckStack();

    AtLeastOneElementStack<PreventItemPickupCheck> getPreventItemPickupCheckStack();

    AtLeastOneElementStack<IsHunterCheck> getIsHunterCheckStack();

    AtLeastOneElementStack<IsTargetCheck> getIsTargetCheckStack();
}
