package net.nordryd.nordspigot;

import net.nordryd.nordspigot.event.EventListener;
import net.nordryd.nordspigot.text.ANSIColors;
import org.bukkit.plugin.java.JavaPlugin;

public class NordSpigot extends JavaPlugin
{
    @Override
    public void onEnable() {
        final String loadedMessage = "NordSpigot has been loaded!";
        getLogger().info(ANSIColors.GREEN + loadedMessage + ANSIColors.RESET);
        getServer().getPluginManager().registerEvents(new EventListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info(ANSIColors.PURPLE + "NordSpigot has been unloaded." + ANSIColors.RESET);
    }
}
