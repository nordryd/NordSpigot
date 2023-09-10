package net.nordryd.nordspigot;

import net.nordryd.nordspigot.text.PrefixFactory;
import org.bukkit.plugin.java.JavaPlugin;

public class NordSpigot extends JavaPlugin
{
    @Override
    public void onEnable() {
        getLogger().info(PrefixFactory.getPrefixedString("onEnable is called!"));
    }

    @Override
    public void onDisable() {
        getLogger().info(PrefixFactory.getPrefixedString("onDisable is called!"));
    }
}
