package lobbysystem.de.mipa.De.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;

public class ProtectionListener implements Listener {

        @EventHandler
        public void onBlockBreak(final BlockBreakEvent event) {
            Player player = event.getPlayer();
            if (!player.hasPermission("lobby.build")){
            event.setCancelled(true);
                        }
        }

        @EventHandler
        public void onBlockPlace(final BlockPlaceEvent event) {
            Player player = event.getPlayer();
            if (!player.hasPermission("lobby.build")){
            event.setCancelled(true);

             }
        }

        @EventHandler
        public void onPlayerDropItem(final PlayerDropItemEvent event) {
            Player player = event.getPlayer();
            if (!player.hasPermission("lobby.build")){
            event.setCancelled(true);
            }
        }

        @EventHandler
         public void onInventoryClick(InventoryClickEvent event){
            if (event.getCurrentItem() == null) return;

            if (event.getView().getTitle().equals("§6Kompass")){
            event.setCancelled(true);
            Player player = (Player) event.getWhoClicked();

            if (event.getView().getTitle().equals("§6Kompass")) {
                if (event.getCurrentItem().getItemMeta().hasLocalizedName()) {
                    switch (event.getCurrentItem().getItemMeta().getLocalizedName()) {
                            case "navigator.citybuild":
                            Location location = new Location(Bukkit.getWorld("lobbymap"),0.4042113307408788,50,34.818419695838145);
                                player.teleport(location);
                              break;
                            case "navigator.survival":
                                Location location2 = new Location(Bukkit.getWorld("lobbymap"),0.5779243100204949,50,-33.40396268936656);
                                player.teleport(location2);
                                break;
                        case "navigator.spawn":
                                Location location3 = new Location(Bukkit.getWorld("lobbymap"),0.6507218913343231,51,0.19942964994776144);
                                player.teleport(location3);
                                break;
                        case "navigator.arbeit":
                            player.sendMessage("§4Dieser Server ist in Arbeit!");
                            break;
                        case "navigator.arbeit2":
                            player.sendMessage("§4Dieser Server ist in Arbeit!");
                            break;




                    }}}}

         }
}
