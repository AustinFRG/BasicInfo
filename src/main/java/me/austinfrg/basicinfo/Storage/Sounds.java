package me.austinfrg.basicinfo.Storage;

import me.austinfrg.basicinfo.BasicInfo;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class Sounds {
    public static BasicInfo plugin;

    public static String getVersion() {
        return Bukkit.getVersion().split("\\(MC: ")[1].split("\\)")[0];
    }
    public static int getMinorVersion() {
        return Integer.parseInt(getVersion().split("\\.")[1]);
    }

    public static void soundEffects(Player player) {
        if (getMinorVersion() == 7) {
            player.playSound(player.getLocation(), Sound.valueOf("NOTE_PLING"), 1f, 1f);
            return;
        }
        if (getMinorVersion() == 8) {
            player.playSound(player.getLocation(), Sound.valueOf("NOTE_PLING"), 1f, 1f);
            return;
        }
        if (getMinorVersion() == 9) {
            player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_PLING"), 1f, 1f);
            return;
        }
        if (getMinorVersion() == 10) {
            player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_PLING"), 1f, 1f);
            return;
        }
        if (getMinorVersion() == 11) {
            player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_PLING"), 1f, 1f);
            return;
        }
        if (getMinorVersion() == 12) {
            player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_PLING"), 1f, 1f);
            return;
        }
        if (getMinorVersion() == 13) {
            player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_BLOCK_PLING"), 1f, 1f);
            return;
        }
        if (getMinorVersion() == 14) {
            player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_BLOCK_PLING"), 1f, 1f);
            return;
        }
        if (getMinorVersion() == 15) {
            player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_BLOCK_PLING"), 1f, 1f);
            return;
        }
        if (getMinorVersion() == 16) {
            player.playSound(player.getLocation(), Sound.valueOf("BLOCK_NOTE_BLOCK_PLING"), 1f, 1f);
            return;
        }
        Messages.sendMSG(player, "&cBasicInfo is not currently compatible with your server version, please contact the plugin developer (" + plugin.getDescription().getAuthors().toString() + ") if you'd like to use this plugin with your version.");
    }
}