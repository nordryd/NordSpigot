package net.nordryd.nordspigot;

import net.nordryd.nordspigot.text.ANSIColors;
import org.bukkit.plugin.java.JavaPlugin;

public class NordSpigot extends JavaPlugin
{
    @Override
    public void onEnable() {
        getLogger().info(ANSIColors.GREEN + "NordSpigot onEnable has been called!" + ANSIColors.RESET);
    }

    @Override
    public void onDisable() {
        getLogger().info(ANSIColors.PURPLE + "NordSpigot onDisable has been called!" + ANSIColors.RESET);
    }
}
