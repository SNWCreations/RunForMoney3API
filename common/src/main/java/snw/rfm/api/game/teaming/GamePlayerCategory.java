package snw.rfm.api.game.teaming;

import snw.rfm.api.game.IGamePlayer;

import java.util.Set;
import java.util.UUID;

public interface GamePlayerCategory {

    String getIdentifier();

    Set<UUID> getEntriesView();

    boolean add(IGamePlayer who);

    boolean remove(IGamePlayer who);

    boolean contains(IGamePlayer who);

    int entryCount();
}
