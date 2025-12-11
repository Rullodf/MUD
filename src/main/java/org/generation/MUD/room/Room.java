package org.generation.MUD.room;

import org.generation.MUD.Player;
import org.generation.MUD.item.Item;
import org.generation.MUD.npc.Enemy;
import org.generation.MUD.npc.NPC;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {
    String id;                                  //id della stanza
    String name;                                //nome della stanza (id, ma più bello da vedere
    String welcomeText;                         //messaggio di entrata nella stanza
    HashMap<String, NPC> npcs;                  //mappa degli NPC presenti nella stanza
    HashMap<String, Enemy> enemies;             //mappa dei nemici presenti nella stanza
    HashMap<String, Item> items;                //mappa degli oggetti presenti nella stanza
    ArrayList<String> exits;                //mappa delle Room a cui questa Room è collegata
    public Room(String id, String name, String welcomeText, HashMap<String, NPC> npcs, HashMap<String, Item> items, ArrayList<String> exits) {
        RoomTypes roomTypes = new RoomTypes();
        this.id = id;
        this.welcomeText = welcomeText;
        this.name = name;
        this.npcs = npcs;
        this.items = items;
        this.exits = exits;
        this.exits.add("settings");
        this.exits.add("exit");
    }

    void enteredRoom(Player player){
        System.out.println(welcomeText);
    }
}


