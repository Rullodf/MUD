package org.generation.MUD.npc;

import org.generation.MUD.Inventory.Inventory;
import org.generation.MUD.Stats;
import org.generation.MUD.item.Armor;
import org.generation.MUD.item.Item;
import org.generation.MUD.item.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Enemy extends NPC {
    Weapon weapon;
    Armor armor;

    public Enemy(String nome, Stats stats, List<List<String>> dialogue, Weapon weapon, List<Item> inventory, Armor armor) {
        super(nome, stats, dialogue, null, inventory);
        this.weapon = weapon;
        this.armor = armor;
    }
}