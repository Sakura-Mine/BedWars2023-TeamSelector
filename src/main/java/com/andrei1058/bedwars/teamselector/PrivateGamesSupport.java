package com.andrei1058.bedwars.teamselector;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PrivateGamesSupport {



    public static void giveItem(Player player){
        ItemStack i = new ItemStack(Material.ICE);
        ItemMeta meta = i.getItemMeta();
        meta.setDisplayName(ChatColor.AQUA+"◆ Start the game ◆");
        i.setItemMeta(meta);
        player.getInventory().setItem(1,i);
    }
}
