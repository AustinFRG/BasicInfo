package me.austinfrg.basicinfo;

import me.austinfrg.basicinfo.Commands.*;
import me.austinfrg.basicinfo.Storage.Sounds;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class BasicInfo extends JavaPlugin implements Listener {

    public static Sounds plugin;

    public void onEnable() {
        this.saveDefaultConfig();
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
        this.getServer().getPluginManager().registerEvents(this, this);
        int pluginId = 8180;
        new Metrics(this, pluginId);
    }

    public void onDisable() {
    }
}