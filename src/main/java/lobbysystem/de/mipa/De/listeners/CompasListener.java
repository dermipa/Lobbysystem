package lobbysystem.de.mipa.De.listeners;

import lobbysystem.de.mipa.De.Util.ItemBuilder;
import lobbysystem.de.mipa.De.Util.NavigatorUtil;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class CompasListener implements Listener {

        private ItemStack navigator = new ItemBuilder(Material.COMPASS).setDisplayname("§6Kompass")
        .setLocalizedName("lobby.navigator").build();

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
        if (event.getItem()!=null && event.getItem().equals(navigator)) {
            NavigatorUtil.openInventory(event.getPlayer());
        }

        }}
    }

