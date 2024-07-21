package com.andrei1058.bedwars.teamselector.api.events;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
@Getter
public class TeamSelectorOpenEvent extends Event implements Cancellable {

    private static final HandlerList HANDLERS = new HandlerList();

    /**
     * -- GETTER --
     *  Get the player
     *
     */
    private final Player player;
    /**
     * -- GETTER --
     *  Check if cancelled
     *
     */
    @Setter
    private boolean cancelled = false;

    /**
     * Called when a player opens the Team Selector GUI
     */
    public TeamSelectorOpenEvent(Player p) {
        this.player = p;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

    @Override
    public boolean isCancelled() {
        return false;
    }

    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }
}
