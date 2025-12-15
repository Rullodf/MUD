package org.generation.MUD;

import org.generation.MUD.item.Consumable;
import org.generation.MUD.item.effect.AddMP;
import org.generation.MUD.item.effect.RemoveVitality;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws InterruptedException {
        GameEngine gameEngine = new GameEngine();
        gameEngine.startGame();
    }
}

/*
    Classi:
        Player
        NPC
          |-> FriendlyNPC
          |-> Monster
          |-> Boss
        Inventory
        Room
          |-> [varie categorie]
        Item
          |-> Weapon
          |-> Armor
          |-> Consumable
          |-> KeyItem
        SaveHandler

 */