package snw.rfm.api.game.hook.global;

import snw.rfm.api.game.IGamePlayer;
import snw.rfm.api.game.IGameTeam;

public interface TeamMemberChangedHook {
    void handle(IGamePlayer who, IGameTeam where);
}
