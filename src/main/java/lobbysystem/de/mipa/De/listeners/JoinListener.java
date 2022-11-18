package lobbysystem.de.mipa.De.listeners;

import lobbysystem.de.mipa.De.Util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.ChatColor;

public class JoinListener implements Listener {


    private ItemStack navigator = new ItemBuilder(Material.COMPASS).setDisplayname("§6Kompass")
    .setLocalizedName("lobby.navigator").build();

    @EventHandler(ignoreCancelled = true)
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();


        player.getInventory().clear();
        player.getInventory().setItem(0,navigator);
        player.sendMessage(ChatColor.DARK_GREEN + "Wilkommen "+
        player.getScoreboard().getPlayerTeam(player).getPrefix()+ChatColor.DARK_GRAY
        +player.getName()+ChatColor.DARK_GREEN +", auf unserem Server! Schaue auf CityBuild vorbei! ");

        event.setJoinMessage(" ");

    }

}
