package com.andrei1058.bedwars.teamselector.api;

import com.tomkeuper.bedwars.api.arena.team.ITeam;
import org.bukkit.entity.Player;

@SuppressWarnings("unused")
public interface TeamSelectorAPI {

    /**
     * Get player's selected team
     */
    ITeam getSelectedTeam(Player player);


    /**
     * Get api version
     */
    int getApiVersion();
}
