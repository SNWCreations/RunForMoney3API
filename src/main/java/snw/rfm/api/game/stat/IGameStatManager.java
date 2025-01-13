package snw.rfm.api.game.stat;

import snw.rfm.api.game.IGamePlayer;

public interface IGameStatManager {
    IGamePlayerStat getStat(IGamePlayer player);
}
