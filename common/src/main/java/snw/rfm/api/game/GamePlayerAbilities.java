package snw.rfm.api.game;

import lombok.Data;

/**
 * The class which describes the abilities that a player could have. <br>
 * The conditions given in docs of the member variable can be applied to common game,
 *  but not always true in some cases. <br>
 * The values in this class are <b>NOT</b> reliable if the player is not online.
 */
@Data
public class GamePlayerAbilities {
    /**
     * Determines if the player should be considered as a regular player.<br>
     * This will be {@code false} if the player was abandoned from the game,
     * but should be {@code true} in <b>ANY OTHER</b> cases.
     */
    private boolean inGame;

    /**
     * Determines if the player could be caught by others who can catch players.<br>
     * This will be {@code false} if:
     * <ul>
     *   <li>The player was a runner but was caught</li>
     *   <li>The player was not a runner</li>
     * </ul>
     */
    private boolean canBeCaught;

    /**
     * Determines if the player can catch other players who can be caught.<br>
     * This will be {@code false} if the player was not a hunter.
     */
    private boolean canCatchOthers;

    /**
     * Determines if the player can abandon the game.<br>
     * This will be {@code false} if the player was not a runner.
     */
    private boolean canAbandon;

    /**
     * Determines if the player can receive notifications from the game.<br>
     * This will be {@code false} if the player was not a runner.
     */
    private boolean canReceiveNotifications;
}