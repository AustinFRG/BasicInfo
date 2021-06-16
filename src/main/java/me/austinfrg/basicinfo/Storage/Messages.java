package me.austinfrg.basicinfo.Storage;

import me.austinfrg.basicinfo.BasicInfo;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Messages {
    public static BasicInfo plugin = JavaPlugin.getPlugin(BasicInfo.class);

    public static void sendMSG(CommandSender player, String message) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

    public static String coloredString(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}