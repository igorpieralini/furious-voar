package org.lucas.furiousvoar.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.lucas.furiousvoar.FuriousVoar;

public class PlayerJoin implements Listener {
    private final FuriousVoar furiousVoar;

    public PlayerJoin(FuriousVoar furiousVoar) {
        this.furiousVoar = furiousVoar;
    }

    @EventHandler
    public void onPlayerChangeWorld(PlayerChangedWorldEvent event) {
        Player player = event.getPlayer();
        furiousVoar.getVoarConfig().getMundos().forEach(mundo -> {
            if (player.getWorld().getName().equals(mundo)) {
                Bukkit.dispatchCommand(player, "fly");
            }
        });
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        furiousVoar.getVoarConfig().getMundos().forEach(mundo -> {
            if (player.getWorld().getName().equals(mundo)) {
                Bukkit.dispatchCommand(player, "fly");
            }
        });
    }
}
