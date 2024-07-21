package com.andrei1058.bedwars.teamselector;

import com.andrei1058.bedwars.teamselector.api.TeamSelector;
import com.andrei1058.bedwars.teamselector.api.TeamSelectorAPI;
import com.andrei1058.bedwars.teamselector.configuration.Config;
import com.andrei1058.bedwars.teamselector.configuration.Messages;
import com.andrei1058.bedwars.teamselector.listeners.ArenaListener;
import com.andrei1058.bedwars.teamselector.listeners.InventoryListener;
import com.andrei1058.bedwars.teamselector.listeners.PlayerInteractListener;
import com.andrei1058.bedwars.teamselector.listeners.SelectorGuiUpdateListener;
import com.tomkeuper.bedwars.api.BedWars;
import com.tomkeuper.bedwars.api.addon.Addon;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.ServicePriority;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class Main extends JavaPlugin {

    public static BedWars bw;
    public static Main plugin;

    /**
     * Register listeners
     */
    private static void registerListeners(Listener @NotNull ... listeners) {
        PluginManager pm = Bukkit.getPluginManager();
        for (Listener l : listeners) {
            pm.registerEvents(l, plugin);
        }
    }

    @Override
    public void onEnable() {
        plugin = this;

        var registration = Bukkit.getServicesManager().getRegistration(BedWars.class);
        if (null == registration) {
            getLogger().severe("Cannot hook into BedWars1058.");
            Bukkit.getPluginManager().disablePlugin(plugin);
            return;
        }


        bw = registration.getProvider();
        getLogger().info("Hooked into BedWars2023!");

        Bukkit.getServicesManager().register(TeamSelectorAPI.class, new TeamSelector(), this, ServicePriority.Normal);
        Config.addDefaultConfig();
        Messages.setupMessages();
        registerListeners(new ArenaListener(), new InventoryListener(), new PlayerInteractListener(), new SelectorGuiUpdateListener());
        BedWars2023Support addonInstance = new BedWars2023Support();
        getServer().getServicesManager().register(Addon.class, addonInstance, plugin, ServicePriority.Normal);
    }
}
