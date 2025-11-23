package org.lucas.furiousvoar;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.lucas.furiousvoar.commands.ReloadPluginCommand;
import org.lucas.furiousvoar.config.VoarConfig;
import org.lucas.furiousvoar.events.PlayerJoin;

@Getter
public final class FuriousVoar extends JavaPlugin {

    VoarConfig voarConfig;

    @Override
    public void onEnable() {
        voarConfig = new VoarConfig(this, "voar.yml");
        registerEvent(new PlayerJoin(this));
        getCommand("rlvoar").setExecutor(new ReloadPluginCommand(this, voarConfig));
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[FuriousVoar] Plugin ativado com sucesso!");
    }

    @Override
    public void onDisable() {
        voarConfig.reloadConfig();
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[FuriousVoar] desativado com sucesso!");

    }

    private void registerEvent(Listener event) {
        Bukkit.getPluginManager().registerEvents(event, this);
    }
}
