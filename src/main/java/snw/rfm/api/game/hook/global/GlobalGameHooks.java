package snw.rfm.api.game.hook.global;

import org.jetbrains.annotations.ApiStatus;
import snw.rfm.api.util.hook.Hook;

public final class GlobalGameHooks {
    public static final Hook<GameStartingHook> GAME_STARTING;
    public static final Hook<TeamMemberChangedHook> PLAYER_JOINED_TEAM;
    public static final Hook<TeamMemberChangedHook> PLAYER_LEFT_TEAM;
    public static final Hook<GroupMemberChangedHook> PLAYER_JOINED_GROUP;
    public static final Hook<GroupMemberChangedHook> PLAYER_LEFT_GROUP;
    public static final Hook<OpStatusChangedHook> OP_STATUS_CHANGED;
    
    static {
        GAME_STARTING = Hook.create();
        PLAYER_JOINED_TEAM = Hook.create();
        PLAYER_LEFT_TEAM = Hook.create();
        PLAYER_JOINED_GROUP = Hook.create();
        PLAYER_LEFT_GROUP = Hook.create();
        OP_STATUS_CHANGED = Hook.create();
    }
    
    private GlobalGameHooks() {
    }
    
    @ApiStatus.Internal
    public static void dispose() {
        GAME_STARTING.dispose();
        PLAYER_JOINED_TEAM.dispose();
        PLAYER_LEFT_TEAM.dispose();
        PLAYER_JOINED_GROUP.dispose();
        PLAYER_LEFT_GROUP.dispose();
        OP_STATUS_CHANGED.dispose();
    }
}
