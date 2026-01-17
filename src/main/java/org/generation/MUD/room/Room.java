package org.generation.MUD.room;

import org.generation.MUD.Player;
import org.generation.MUD.Utilities;
import org.generation.MUD.interactable.Door;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {
    boolean firstEnter = true;
    String id;                                  //id della stanza
    String name;                                //nome della stanza (id, ma più bello da vedere
    String welcomeText;                         //messaggio di entrata nella stanza
    String comebackText;
    String exploreText;
    OnEnter enter;
    ArrayList<String> npcs;                     //lista degli NPC presenti nella stanza
    ArrayList<String> enemies;                 //lista dei nemici presenti nella stanza
    ArrayList<String> items;                 //lista dei nemici presenti nella stanza
    ArrayList<Door> interactables;                 //lista di cose interagibili
    HashMap<String, String> exits;              //chiave: nome temporaneo dell'uscita, valore: ID della stanza collegata all'uscita


    public Room(String id, String name, String welcomeText, String comebackText, String exploreText,
                ArrayList<String> npcs, ArrayList<String> items, ArrayList<Door> interactables, HashMap<String, String> exits, OnEnter enter) {
        this.id = id;
        this.welcomeText = welcomeText;
        this.comebackText = comebackText;
        this.exploreText = exploreText;
        this.name = name;
        this.npcs = npcs == null ? new ArrayList<>() : npcs;
        this.interactables = interactables == null ? new ArrayList<>() : interactables;
        this.items = items == null ? new ArrayList<>() : items;
        this.exits = exits;
        this.enter = enter;
        if (!id.equals("startMenu")) {
            this.exits.put("menù-iniziale", "startMenu");
        }
        if (id.equals("settings")) {
            this.exits.put("impostazioni", "settings");
        }
    }

    public Room(String id, String name, String welcomeText, String comebackText, String exploreText,
                ArrayList<String> npcs, ArrayList<String> items, ArrayList<Door> interactables, HashMap<String, String> exits) {

        this(id, name, welcomeText, comebackText, exploreText, npcs, items, interactables, exits, null);
    }

    public void enteredRoom(Player player) {
        IO.println("\033[H\033[2J");
        if (firstEnter) {
            Utilities.stampaAMacchina(welcomeText);
            firstEnter = false;
        } else {
            Utilities.stampaAMacchina(comebackText);
        }
        if (this.enter != null) {
            enter.execute(player);
        }
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getWelcomeText() {
        return welcomeText;
    }

    public String getComebackText() {
        return comebackText;
    }

    public String getExploreText() {
        return exploreText;
    }

    public ArrayList<String> getNpcs() {
        return npcs;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public ArrayList<String> getEnemies() {
        return enemies;
    }

    public HashMap<String, String> getExits() {
        return exits;
    }

    public ArrayList<Door> getInteractables() {
        return interactables;
    }
}


