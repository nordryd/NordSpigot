package net.nordryd.nordspigot.event;

import net.nordryd.nordspigot.text.PrefixFactory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * <a href=https://hub.spigotmc.org/javadocs/spigot/org/bukkit/event/package-summary.html>List of events</a>
 */
public class EventListener implements Listener
{
    @EventHandler
    public void onPlayerJoin(final PlayerJoinEvent event) {
        event.setJoinMessage(PrefixFactory.getPrefixedMessage("Welcome, %s!", event.getPlayer().getName()));
    }

    @EventHandler
    public void onEggThrow(final PlayerEggThrowEvent event) {
        final Player player = event.getPlayer();
        player.getWorld().strikeLightningEffect(event.getEgg().getLocation());
        player.sendMessage(PrefixFactory.getPrefixedMessage("The egg smite-eth thee!"));
    }
}
