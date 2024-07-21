package com.andrei1058.bedwars.teamselector;

import com.tomkeuper.bedwars.api.addon.Addon;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class BedWars2023Support extends Addon {


    @Override
    public String getAuthor() {
        return "EhsanMNA";
    }

    @Override
    public Plugin getPlugin() {
        return Main.plugin;
    }

    @Override
    public String getVersion() {
        return "1.0";
    }

    @Override
    public String getName() {
        return "Team Selector";
    }

    @Override
    public String getDescription() {
        return "Team Selector addon for bedwrs2023";
    }

    @Override
    public void load() {
        Bukkit.getPluginManager().enablePlugin(Main.plugin);
    }

    @Override
    public void unload() {
        Bukkit.getPluginManager().disablePlugin(Main.plugin);
    }
}
