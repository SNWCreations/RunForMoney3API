package snw.rfm.api.game;

import lombok.NonNull;
import snw.rfm.api.game.teaming.GamePlayerCategory;

import java.util.Set;
import java.util.UUID;

public interface IGameTeam extends GamePlayerCategory {
    String HUNTER = "hunter";
    String RUNNER = "runner";
    String NPC = "npc";
    String OUT = "out";
    String ABANDON = "abandon";

    Set<UUID> getEntriesView();

    boolean contains(@NonNull IGamePlayer who);

    boolean add(@NonNull IGamePlayer who);

    boolean remove(@NonNull IGamePlayer who);

    int entryCount();

    String getIdentifier();
}
