package me.austinfrg.basicinfo.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class BasicReloadCommand implements CommandExecutor {
    private final JavaPlugin plugin;

    public BasicReloadCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public static String getVersion() {
        return Bukkit.getVersion().split("\\(MC: ")[1].split("\\)")[0];
    }

    public static int getMinorVersion() {
        return Integer.parseInt(getVersion().split("\\.")[1]);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (!sender.hasPermission("basicinfo.reload")) {
                sender.sendMessage(ChatColor.RED + "You don't have permission to run this command.");
                return false;
            }
            if (getMinorVersion() == 7) {
                plugin.saveDefaultConfig();
                plugin.reloadConfig();
                player.playSound(player.getLocation(), Sound.valueOf("NOTE_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo config file reloaded successfully!"));
                return true;
            }
            if (getMinorVersion() == 8) {
                plugin.saveDefaultConfig();
                plugin.reloadConfig();
                player.playSound(player.getLocation(), Sound.valueOf("NOTE_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo config file reloaded successfully!"));
                return true;
            }
            if (getMinorVersion() == 9) {
                plugin.saveDefaultConfig();
                plugin.reloadConfig();
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo config file reloaded successfully!"));
                return true;
            }
            if (getMinorVersion() == 10) {
                plugin.saveDefaultConfig();
                plugin.reloadConfig();
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo config file reloaded successfully!"));
                return true;
            }
            if (getMinorVersion() == 11) {
                plugin.saveDefaultConfig();
                plugin.reloadConfig();
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo config file reloaded successfully!"));
                return true;
            }
            if (getMinorVersion() == 12) {
                plugin.saveDefaultConfig();
                plugin.reloadConfig();
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo config file reloaded successfully!"));
                return true;
            }
            if (getMinorVersion() == 13) {
                plugin.saveDefaultConfig();
                plugin.reloadConfig();
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_BLOCK_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo config file reloaded successfully!"));
                return true;
            }
            if (getMinorVersion() == 14) {
                plugin.saveDefaultConfig();
                plugin.reloadConfig();
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_BLOCK_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo config file reloaded successfully!"));
                return true;
            }
            if (getMinorVersion() == 15) {
                plugin.saveDefaultConfig();
                plugin.reloadConfig();
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_BLOCK_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo config file reloaded successfully!"));
                return true;
            }
            if (getMinorVersion() == 16) {
                plugin.saveDefaultConfig();
                plugin.reloadConfig();
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_BLOCK_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo config file reloaded successfully!"));
                return true;
            }
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo is not currently compatible with your server version, please contact the plugin developer (AustinFRG) if you are using a version 1.7-1.16 and you see this message."));
            return true;
        }
        plugin.saveDefaultConfig();
        plugin.reloadConfig();
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo config file reloaded successfully!"));
        return true;
    }
}