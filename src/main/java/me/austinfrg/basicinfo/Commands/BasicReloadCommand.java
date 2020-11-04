package me.austinfrg.basicinfo.Commands;

import me.austinfrg.basicinfo.Storage.Messages;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import static me.austinfrg.basicinfo.Storage.Sounds.soundEffects;

public class BasicReloadCommand implements CommandExecutor {
    private final JavaPlugin plugin;

    public BasicReloadCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!sender.hasPermission("basicinfo.reload")) {
                sender.sendMessage(ChatColor.RED + "You don't have permission to run this command.");
                return false;
            }
            soundEffects(player);
        }
        plugin.saveDefaultConfig();
        plugin.reloadConfig();
        Messages.sendMSG(sender, "&cBasicInfo config file reloaded successfully!");
        return true;
    }
}