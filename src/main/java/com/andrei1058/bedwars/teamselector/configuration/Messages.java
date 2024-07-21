package com.andrei1058.bedwars.teamselector.configuration;

import com.tomkeuper.bedwars.api.language.Language;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collections;

public class Messages {

    @SuppressWarnings("WeakerAccess")
    public static final String PATH = "addons.team-selector.";
    public static final String GUI_NAME = PATH + "inventory-name";
    public static final String SELECTOR_NAME = PATH + "selector-name";
    public static final String SELECTOR_LORE = PATH + "selector-lore";
    public static final String CHOICE_NAME = PATH + "choice.name";
    public static final String CHOICE_LORE = PATH + "choice.lore";
    public static final String SWITCH_DISABLED = PATH + "switch-disabled";
    public static final String TEAM_JOIN = PATH + "team-join";
    public static final String TEAM_FULL = PATH + "team-full";
    public static final String TEAM_NOT_BALANCED = PATH + "teams-not-balanced";
    public static final String PARTY_DENIED = PATH + "party-deny";
    public static final String CANT_JOIN_WHILE_STARTING = PATH + "cant-join-while-starting";
    public static final String ALREADY_IN_TEAM = PATH + "already-in-team";

    /**
     * Setup Default Messages
     */
    public static void setupMessages() {
        for (Language l : Language.getLanguages()) {
            addDefault(l, GUI_NAME, "&8Team Selector", "&8Alege o Echipa");
            addDefault(l, SELECTOR_NAME, "&9Team Selector", "&9Alege o Echipa");
            addDefault(l, SELECTOR_LORE, Collections.singletonList("&7Right-Click to to open!"), Collections.singletonList("&7Deschide cu click-dreapta!"));
            addDefault(l, CHOICE_LORE, Arrays.asList("", "&7&o{members}", "", "&eClick to join!"), Arrays.asList("", "&7&o{members}", "", "&eIntra cu Click!"));
            addDefault(l, CHOICE_NAME, "{color}{team} &f({selected}&7/&f{total})", "{color}{team} &f({selected}&7/&f{total})");
            addDefault(l, SWITCH_DISABLED, "&cYou cannot change your team!", "&cPoti alege echipa o singura data!");
            addDefault(l, TEAM_JOIN, "&eYou joined the {color}{team} &eteam!", "&eTe-ai alaturat echipei {color}{team}&e!");
            addDefault(l, TEAM_FULL, "{color}{team} &c Team is full!", "&cEchipa {color}{team} &c este plina!");
            addDefault(l, TEAM_NOT_BALANCED, "&cTeams are not balanced! Try joining another team!", "}&cEchipele nu sunt echilibrate! Incearca alta!");
            addDefault(l, PARTY_DENIED, "&cYou can't choose your team because you're in a party!", "&cNu poti alege o echipa pentru că te afli intr-un party!");
            addDefault(l, CANT_JOIN_WHILE_STARTING, "&cYou cannot join this team at this moment. The game is starting!", "&cNu poti intra in aceasta echipa chiar acum. Incepe jocul!");
            addDefault(l, ALREADY_IN_TEAM, "&cYou are already in this team!", "&cSunteți deja în această echipă");
        }
    }

    private static void addDefault(@NotNull Language l, String path, Object english, Object romanian) {
        if (!l.exists(path)) {
            l.set(path, l.getIso().equals("ro") ? romanian : english);
        }
    }
}
