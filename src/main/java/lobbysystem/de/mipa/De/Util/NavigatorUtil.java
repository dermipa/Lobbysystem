package lobbysystem.de.mipa.De.Util;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class NavigatorUtil {

    public static void openInventory(Player player){
        Inventory inventory = Bukkit.createInventory(null, 45, "§6Kompass");
        for (int i = 0; i < 45; i++) {
            inventory.setItem(i,new ItemBuilder(Material.WHITE_STAINED_GLASS_PANE).setDisplayname(" ").build());
        }

        inventory.setItem(11, new ItemBuilder(Material.GRASS_BLOCK).setDisplayname("§aCityBuild").setLocalizedName("navigator.citybuild").build());
        inventory.setItem(15, new ItemBuilder(Material.IRON_SWORD).setDisplayname("§cSurvival").setLocalizedName("navigator.survival").build());
        inventory.setItem(22, new ItemBuilder(Material.MAGMA_CREAM).setDisplayname("§6Spawn").setLocalizedName("navigator.spawn").build());
        inventory.setItem(29, new ItemBuilder(Material.BARRIER).setDisplayname("§4In Arbeit").setLocalizedName("navigator.arbeit").build());
        inventory.setItem(33, new ItemBuilder(Material.BARRIER).setDisplayname("§4In Arbeit").setLocalizedName("navigator.arbeit2").build());




        player.openInventory(inventory);

    }

}
