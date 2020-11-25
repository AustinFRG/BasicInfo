package me.austinfrg.basicinfo.Storage;

import me.austinfrg.basicinfo.BasicInfo;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class Other {
    public static BasicInfo plugin;

    public static void setupAliases(String message, Player player, PlayerCommandPreprocessEvent e) {
        for(String entry : plugin.getConfig().getStringList("infoaliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "info");
                e.setCancelled(true);
            }
        }
        for(String entry : plugin.getConfig().getStringList("websitealiases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "website");
                e.setCancelled(true);
            }
        }
        for(String entry : plugin.getConfig().getStringList("forumsaliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "forums");
                e.setCancelled(true);
            }
        }
        for(String entry : plugin.getConfig().getStringList("discordaliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "discord");
                e.setCancelled(true);
            }
        }
        for(String entry : plugin.getConfig().getStringList("storealiases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "store");
                e.setCancelled(true);
            }
        }
        for(String entry : plugin.getConfig().getStringList("applicationaliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "apply");
                e.setCancelled(true);
            }
        }
        for(String entry : plugin.getConfig().getStringList("appealaliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "appeal");
                e.setCancelled(true);
            }
        }
        for(String entry : plugin.getConfig().getStringList("basicinfoaliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "basicinfo");
                e.setCancelled(true);
            }
        }
        for(String entry : plugin.getConfig().getStringList("basicreloadaliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "basicreload");
                e.setCancelled(true);
            }
        }
    }
}
