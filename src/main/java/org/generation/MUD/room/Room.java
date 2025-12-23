package org.generation.MUD.room;

import org.generation.MUD.Player;
import org.generation.MUD.Utilities;
import org.generation.MUD.item.Item;
import org.generation.MUD.npc.Enemy;
import org.generation.MUD.npc.NPC;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {
    String id;                                  //id della stanza
    String name;                                //nome della stanza (id, ma più bello da vedere
    String welcomeText;                         //messaggio di entrata nella stanza
    String comebackText;
    String exploreText;
    OnEnter enter;
    ArrayList<String> npcs;                     //lista degli NPC presenti nella stanza
    ArrayList<String> enemies;                 //lista dei nemici presenti nella stanza
    ArrayList<String> items;                 //lista dei nemici presenti nella stanza
    HashMap<String, String> exits;              //chiave: nome temporaneo dell'uscita, valore: ID della stanza collegata all'uscita


    public void enteredRoom(Player player) {
        Utilities.stampaAMacchina(welcomeText);
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
}


