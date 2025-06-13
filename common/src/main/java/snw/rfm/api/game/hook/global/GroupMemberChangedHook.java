package snw.rfm.api.game.hook.global;

import snw.rfm.api.game.IGamePlayer;
import snw.rfm.api.game.teaming.GamePlayerGroup;

public interface GroupMemberChangedHook {
    void handle(IGamePlayer who, GamePlayerGroup where);
}
