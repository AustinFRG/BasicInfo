package me.austinfrg.basicinfo.Commands;

import me.austinfrg.basicinfo.Storage.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

import static me.austinfrg.basicinfo.Storage.Sounds.soundEffects;

public class ApplicationCommand implements CommandExecutor {
    private final JavaPlugin plugin;

    public ApplicationCommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            soundEffects(player);
        }
        String prefix = Objects.requireNonNull(plugin.getConfig().getString("prefix"));
        String link = Objects.requireNonNull(plugin.getConfig().getString("applicationlink"));
        Messages.sendMSG(sender, prefix + link);
        return true;
    }
}
