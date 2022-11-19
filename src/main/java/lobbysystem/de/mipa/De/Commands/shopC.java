package lobbysystem.de.mipa.De.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class shopC implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        String messageShop  = "§cMineVillage.de §8» §aHole dir einen Rang auf shop.minevillage.de";

        sender.sendMessage(messageShop);
        return false;

    }
}
