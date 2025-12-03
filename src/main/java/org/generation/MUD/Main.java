package org.generation.MUD;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        GameEngine gameEngine = new GameEngine();
        gameEngine.StartGame();
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