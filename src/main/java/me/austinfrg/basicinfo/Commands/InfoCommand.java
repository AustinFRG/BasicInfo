package me.austinfrg.basicinfo.Commands;

import me.austinfrg.basicinfo.Utils.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

import static me.austinfrg.basicinfo.Utils.Sounds.soundEffects;

public class InfoCommand implements CommandExecutor, Listener {
    private final JavaPlugin plugin;

    public InfoCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            soundEffects(player);
        }
        String prefix = Objects.requireNonNull(plugin.getConfig().getString("prefix"));
        String link1 = Objects.requireNonNull(plugin.getConfig().getString("websiteLink"));
        String link2 = Objects.requireNonNull(plugin.getConfig().getString("forumsLink"));
        String link3 = Objects.requireNonNull(plugin.getConfig().getString("discordLink"));
        String link4 = Objects.requireNonNull(plugin.getConfig().getString("storeLink"));
        String link5 = Objects.requireNonNull(plugin.getConfig().getString("applicationLink"));
        String link6 = Objects.requireNonNull(plugin.getConfig().getString("appealLink"));
        Messages.sendMSG(sender, prefix + link1);
        Messages.sendMSG(sender, prefix + link2);
        Messages.sendMSG(sender, prefix + link3);
        Messages.sendMSG(sender, prefix + link4);
        Messages.sendMSG(sender, prefix + link5);
        Messages.sendMSG(sender, prefix + link6);
        return true;
    }
}
