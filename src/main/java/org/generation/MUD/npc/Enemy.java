package org.generation.MUD.npc;

import org.generation.MUD.Inventory;
import org.generation.MUD.Stats;
import org.generation.MUD.item.Armor;
import org.generation.MUD.item.Weapon;

import java.util.ArrayList;

public class Enemy extends NPC {
    Weapon weapon;
    Inventory inventory;
    Armor armor;

    public Enemy(String nome, Stats stats, ArrayList<String> dialogue, Weapon weapon, Inventory inventory, Armor armor) {
        super(nome, stats, dialogue);
        this.weapon = weapon;
        this.inventory = inventory;
        this.armor = armor;
    }
}