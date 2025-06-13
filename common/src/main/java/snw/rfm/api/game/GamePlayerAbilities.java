package snw.rfm.api.game;

import lombok.Data;

@Data
public class GamePlayerAbilities {
    /**
     * Decides if the player should be considered as a regular player,
     *  which could be arrested by hunters or interact with some
     *  third-party logics.
     */
    private boolean inGame;
}
