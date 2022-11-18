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

        //Hier erstellen wir einen Plugin manager dieser wird gebraucht damit man events Regestrieren kann!
        PluginManager pm = Bukkit.getPluginManager();
        //Hier regestrieren wir nun das Event.
        //Achtung Man muss ,this hinter die Klasse schreiben weil zum registrieren eine klasse mit JavaPlugin nötigg ist!
        pm.registerEvents(new JoinListener(),this);
        pm.registerEvents(new ProtectionListener(),this);
        pm.registerEvents(new CompasListener(), this);
        
        ConsoleCommandSender console = Bukkit.getConsoleSender();
        console.sendMessage(ChatColor.DARK_GREEN + "Addon erfolgreich geladen!");

        }

    @Override
    public void onDisable() {
    }
}

