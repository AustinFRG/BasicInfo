package me.austinfrg.basicinfo;

import me.austinfrg.basicinfo.Commands.*;
import me.austinfrg.basicinfo.Utils.Placeholders;
import me.austinfrg.basicinfo.Utils.Sounds;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class BasicInfo extends JavaPlugin implements Listener {
    public static Sounds plugin;

    public void onEnable() {
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) new Placeholders(this).register();
        Objects.requireNonNull(this.getCommand("info")).setExecutor(new InfoCommand(this));
        Objects.requireNonNull(this.getCommand("appeal")).setExecutor(new AppealCommand(this));
        Objects.requireNonNull(this.getCommand("website")).setExecutor(new WebsiteCommand(this));
        Objects.requireNonNull(this.getCommand("forums")).setExecutor(new ForumsCommand(this));
        Objects.requireNonNull(this.getCommand("discord")).setExecutor(new DiscordCommand(this));
        Objects.requireNonNull(this.getCommand("store")).setExecutor(new StoreCommand(this));
        Objects.requireNonNull(this.getCommand("apply")).setExecutor(new ApplicationCommand(this));
        Objects.requireNonNull(this.getCommand("appeal")).setExecutor(new AppealCommand(this));
        Objects.requireNonNull(this.getCommand("basicinfo")).setExecutor(new BasicInfoCommand(this));
        Objects.requireNonNull(this.getCommand("basicreload")).setExecutor(new BasicReloadCommand(this));
        Bukkit.getPluginManager().registerEvents(this, this);
        this.saveDefaultConfig();
        int pluginId = 8180;
        new Metrics(this, pluginId);
    }

    public void onDisable() {
    }

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent e) {
        String message = e.getMessage();
        Player player = e.getPlayer();
        for(String entry : this.getConfig().getStringList("infoAliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "info");
                e.setCancelled(true);
                return;
            }
        }
        for(String entry : this.getConfig().getStringList("websiteAliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "website");
                e.setCancelled(true);
                return;
            }
        }
        for(String entry : this.getConfig().getStringList("forumsAliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "forums");
                e.setCancelled(true);
                return;
            }
        }
        for(String entry : this.getConfig().getStringList("discordAliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "discord");
                e.setCancelled(true);
                return;
            }
        }
        for(String entry : this.getConfig().getStringList("storeAliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "store");
                e.setCancelled(true);
                return;
            }
        }
        for(String entry : this.getConfig().getStringList("applicationAliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "apply");
                e.setCancelled(true);
                return;
            }
        }
        for(String entry : this.getConfig().getStringList("appealAliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "appeal");
                e.setCancelled(true);
                return;
            }
        }
        for(String entry : this.getConfig().getStringList("basicInfoAliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "basicinfo");
                e.setCancelled(true);
                return;
            }
        }
        for(String entry : this.getConfig().getStringList("basicReloadAliases")) {
            if (message.equals("/" + entry)) {
                Bukkit.getServer().dispatchCommand(player, "basicreload");
                e.setCancelled(true);
                return;
            }
        }
    }
}
