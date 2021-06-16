package me.austinfrg.basicinfo.Utils;

import me.austinfrg.basicinfo.BasicInfo;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.entity.Player;

public class Placeholders extends PlaceholderExpansion {

    private final BasicInfo plugin;

    public Placeholders(BasicInfo plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean persist(){
        return true;
    }

    @Override
    public boolean canRegister(){
        return true;
    }

    @Override
    public String getAuthor(){
        return plugin.getDescription().getAuthors().toString();
    }

    @Override
    public String getIdentifier(){
        return plugin.getDescription().getName().toLowerCase();
    }

    @Override
    public String getVersion(){
        return plugin.getDescription().getVersion();
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier){

        if(player == null){
            return "";
        }

        // %basicinfo_all%
        if(identifier.equals("all")) {
            return plugin.getConfig().getString("websiteLink", "N/A") + "\n" +
                    plugin.getConfig().getString("discordLink", "N/A") + "\n" +
                    plugin.getConfig().getString("storeLink", "N/A") + "\n" +
                    plugin.getConfig().getString("forumsLink", "N/A") + "\n" +
                    plugin.getConfig().getString("appealLink", "N/A") + "\n" +
                    plugin.getConfig().getString("applicationLink", "N/A");
        }

        // %basicinfo_appeal%
        if(identifier.equals("appeal")) {
            return plugin.getConfig().getString("appealLink", "N/A");
        }

        // %basicinfo_application%
        if(identifier.equals("application")) {
            return plugin.getConfig().getString("applicationLink", "N/A");
        }

        // %basicinfo_discord%
        if(identifier.equals("discord")) {
            return plugin.getConfig().getString("discordLink", "N/A");
        }

        // %basicinfo_forums%
        if(identifier.equals("forums")) {
            return plugin.getConfig().getString("forumsLink", "N/A");
        }

        // %basicinfo_store%
        if(identifier.equals("store")) {
            return plugin.getConfig().getString("storeLink", "N/A");
        }

        // %basicinfo_website%
        if(identifier.equals("website")) {
            return plugin.getConfig().getString("websiteLink", "N/A");
        }

        return null;
    }
}
