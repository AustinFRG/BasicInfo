package me.austinfrg.basicinfo.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class InfoCommand implements CommandExecutor, Listener {
    private final JavaPlugin plugin;

    public InfoCommand(JavaPlugin plugin) {
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
            if (getMinorVersion() == 7) {
                player.playSound(player.getLocation(), Sound.valueOf("NOTE_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallink"))));
                return true;
            }
            if (getMinorVersion() == 8) {
                player.playSound(player.getLocation(), Sound.valueOf("NOTE_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallink"))));
                return true;
            }
            if (getMinorVersion() == 9) {
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallink"))));
                return true;
            }
            if (getMinorVersion() == 10) {
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallink"))));
                return true;
            }
            if (getMinorVersion() == 11) {
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallink"))));
                return true;
            }
            if (getMinorVersion() == 12) {
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallink"))));
                return true;
            }
            if (getMinorVersion() == 13) {
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_BLOCK_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallink"))));
                return true;
            }
            if (getMinorVersion() == 14) {
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_BLOCK_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallink"))));
                return true;
            }
            if (getMinorVersion() == 15) {
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_BLOCK_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallink"))));
                return true;
            }
            if (getMinorVersion() == 16) {
                player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_BLOCK_PLING"), 1f, 1f);
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlink"))));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallink"))));
                return true;
            }
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cBasicInfo is not currently compatible with your server version, please contact the plugin developer (AustinFRG) if you are using a version 1.7-1.16 and you see this message."));
            return true;
        }
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelink"))));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslink"))));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlink"))));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelink"))));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlink"))));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallink"))));
        return true;
    }
}
