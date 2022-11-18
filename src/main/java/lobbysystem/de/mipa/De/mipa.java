package lobbysystem.de.mipa.De;


import lobbysystem.de.mipa.De.listeners.CompasListener;
import lobbysystem.de.mipa.De.listeners.JoinListener;
import lobbysystem.de.mipa.De.listeners.ProtectionListener;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class mipa extends JavaPlugin {

    @Override
    public void onEnable() {

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new JoinListener(),this);
        pm.registerEvents(new ProtectionListener(),this);
        pm.registerEvents(new CompasListener(), this);
        
        ConsoleCommandSender console = Bukkit.getConsoleSender();
        console.sendMessage(ChatColor.DARK_GREEN + "Lobbysystem erfolgreich geladen!");

        }

    @Override
    public void onDisable() {
    }
}

