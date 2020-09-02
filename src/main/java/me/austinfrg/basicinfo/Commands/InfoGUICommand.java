package me.austinfrg.basicinfo.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collections;
import java.util.Objects;

public class InfoGUICommand implements CommandExecutor, Listener {
    private final JavaPlugin plugin;

    public InfoGUICommand(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Inventory gui = Bukkit.createInventory(null, Integer.parseInt(Objects.requireNonNull(plugin.getConfig().getString("guisize"))), ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("guiname"))));

            ItemStack website = new ItemStack(Material.valueOf(plugin.getConfig().getString("websiteitem")));
            ItemStack forums = new ItemStack(Material.valueOf(plugin.getConfig().getString("forumsitem")));
            ItemStack discord = new ItemStack(Material.valueOf(plugin.getConfig().getString("discorditem")));
            ItemStack store = new ItemStack(Material.valueOf(plugin.getConfig().getString("storeitem")));
            ItemStack application = new ItemStack(Material.valueOf(plugin.getConfig().getString("applicationitem")));
            ItemStack appeal = new ItemStack(Material.valueOf(plugin.getConfig().getString("appealitem")));
            ItemMeta websiteMeta = website.getItemMeta();
            ItemMeta forumsMeta = forums.getItemMeta();
            ItemMeta discordMeta = discord.getItemMeta();
            ItemMeta storeMeta = store.getItemMeta();
            ItemMeta applicationMeta = application.getItemMeta();
            ItemMeta appealMeta = appeal.getItemMeta();

            Objects.requireNonNull(websiteMeta).setDisplayName(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websiteitemname"))));
            Objects.requireNonNull(forumsMeta).setDisplayName(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumsitemname"))));
            Objects.requireNonNull(discordMeta).setDisplayName(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discorditemname"))));
            Objects.requireNonNull(storeMeta).setDisplayName(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storeitemname"))));
            Objects.requireNonNull(applicationMeta).setDisplayName(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationitemname"))));
            Objects.requireNonNull(appealMeta).setDisplayName(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appealitemname"))));
            Objects.requireNonNull(websiteMeta).setLore(Collections.singletonList(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelore")))));
            Objects.requireNonNull(forumsMeta).setLore(Collections.singletonList(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslore")))));
            Objects.requireNonNull(discordMeta).setLore(Collections.singletonList(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlore")))));
            Objects.requireNonNull(storeMeta).setLore(Collections.singletonList(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelore")))));
            Objects.requireNonNull(applicationMeta).setLore(Collections.singletonList(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlore")))));
            Objects.requireNonNull(appealMeta).setLore(Collections.singletonList(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallore")))));
            website.setItemMeta(websiteMeta);
            website.setItemMeta(forumsMeta);
            website.setItemMeta(discordMeta);
            website.setItemMeta(storeMeta);
            website.setItemMeta(applicationMeta);
            website.setItemMeta(appealMeta);

            gui.setItem(Integer.parseInt(Objects.requireNonNull(plugin.getConfig().getString("websiteslot"))), website);
            gui.setItem(Integer.parseInt(Objects.requireNonNull(plugin.getConfig().getString("forumsslot"))), forums);
            gui.setItem(Integer.parseInt(Objects.requireNonNull(plugin.getConfig().getString("discordslot"))), discord);
            gui.setItem(Integer.parseInt(Objects.requireNonNull(plugin.getConfig().getString("storeslot"))), store);
            gui.setItem(Integer.parseInt(Objects.requireNonNull(plugin.getConfig().getString("applicationslot"))), application);
            gui.setItem(Integer.parseInt(Objects.requireNonNull(plugin.getConfig().getString("appealslot"))), appeal);

            player.openInventory(gui);
            return true;
        }
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9+--------------&b BasicInfo &9--------------+"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("websitelink"))));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("forumslink"))));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("discordlink"))));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("storelink"))));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("applicationlink"))));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("prefix"))) + ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(plugin.getConfig().getString("appeallink"))));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&9+-------------------------------------+"));
        return true;
    }
}