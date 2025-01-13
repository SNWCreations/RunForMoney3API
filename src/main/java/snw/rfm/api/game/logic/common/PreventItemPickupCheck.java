package snw.rfm.api.game.logic.common;

import org.bukkit.inventory.ItemStack;
import snw.rfm.api.game.IGamePlayer;

public interface PreventItemPickupCheck {
    boolean shouldRejectItemPickup(IGamePlayer who, ItemStack item);
}
