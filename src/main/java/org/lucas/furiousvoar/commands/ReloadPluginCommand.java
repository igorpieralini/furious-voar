package org.lucas.furiousvoar.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.lucas.furiousvoar.FuriousVoar;
import org.lucas.furiousvoar.config.VoarConfig;

public class ReloadPluginCommand implements CommandExecutor {

    private final FuriousVoar furiousVoar;
    private final VoarConfig voarConfig;

    public ReloadPluginCommand(FuriousVoar furiousVoar, VoarConfig voarConfig) {
        this.furiousVoar = furiousVoar;
        this.voarConfig = voarConfig;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player) {
            Player player = (Player) sender;
            if(player.isOp()) {
                voarConfig.reloadConfig();
                player.sendMessage(ChatColor.GREEN + "Arquivo do FuriousVoar recarregado.");
            }
        }else{
            voarConfig.reloadConfig();
            Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Arquivo do FuriousVoar recarregado.");
        }
        return false;
    }
}
