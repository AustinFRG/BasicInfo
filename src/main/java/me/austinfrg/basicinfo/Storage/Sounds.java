package me.austinfrg.basicinfo.Storage;

import com.cryptomorin.xseries.XSound;
import me.austinfrg.basicinfo.BasicInfo;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class Sounds {
    public static BasicInfo plugin = JavaPlugin.getPlugin(BasicInfo.class);

    public static void soundEffects(Player player) {
        Sound sound;
        try {
            sound = XSound.valueOf(plugin.getConfig().getString("commandSound")).parseSound();
            if (sound == null) {
                plugin.getLogger().log(Level.WARNING, "Unable to find the sound set in config.");
                return;
            }
        } catch (Exception ex) {
            plugin.getLogger().log(Level.WARNING, "Unable to find the sound set in config.");
            return;
        }
        player.playSound(player.getLocation(), sound, 1f, 1f);
    }
}