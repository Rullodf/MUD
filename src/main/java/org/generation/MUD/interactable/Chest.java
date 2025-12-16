package org.generation.MUD.interactable;

import org.generation.MUD.Inventory;
import org.generation.MUD.Player;
import org.generation.MUD.item.Item;
import org.generation.MUD.item.KeyItem;
import org.generation.MUD.room.Room;

import java.util.ArrayList;
import java.util.Collections;

public class Chest implements Interactable {
    boolean islocked;
    KeyItem keyItem;
    ArrayList<Item> loot;

    public Chest(KeyItem keyItem, Item... items) {
        this.islocked = true;
        this.keyItem = keyItem;
        loot = new ArrayList<>();
        Collections.addAll(loot, items);
    }

    public Chest(Item... items) {
        this.islocked = false;
        this.keyItem = null;
    }

    public void interact(Player player, Room currentRoom) {
        if (islocked) {
            if (player.getInventory().getCategoryList("keyitem").contains(keyItem)) {
                System.out.println("Il baule si è aperto!");
                islocked = false;
            } else {
                IO.println("Non hai la chiave per aprire questo baule.");
                return;
            }
        }
        for (int i = 0; i < loot.size(); i++) {
            if (loot.get(i).getWeight() + player.getInventory().getActualWeight() > player.getInventory().getMaxWeight()){
                IO.print("Inventario pieno, non puoi aggiungere " + loot.get(i).getName());
            }else{
                player.getInventory().addItem(loot.get(i));
                loot.remove(i);
                i--;
            }
        }
        loot.clear();
    }
}
