package org.generation.MUD;

import org.generation.MUD.item.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    protected HashMap<String, ArrayList<Item>> inventory = new HashMap<>();
    protected final int maxWeight = 50;
    protected int actualWeight;

    public Inventory() {
        inventory.put("armor", new ArrayList<>());
        inventory.put("weapon", new ArrayList<>());
        inventory.put("keyitem", new ArrayList<>());
        inventory.put("consumable", new ArrayList<>());
    }

    public boolean addItem(Item toInsert) {
        if (toInsert.getWeight() + actualWeight > maxWeight) {
            return false;
        }
        switch (toInsert) {
            case Armor a -> {
                inventory.get("armor").add(a);
            }
            case Weapon w -> {
                inventory.get("weapon").add(w);
            }
            case Consumable c -> {
                inventory.get("consumable").add(c);
            }
            case KeyItem k -> {
                inventory.get("keyitem").add(k);
            }
            default -> {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
//        String.format("feafaf", parametri);     stessa cosa di
//        "dafeafl".formatted(parametri)
        //mattia sei un grande <3
        //la stella più luminosa
        //colui che farà vincere java150 contro java149
        return """
                -> Inventario <-
                Armature: %s
                Armi: %s
                Consumabili: %s
                Oggetti chiave: %s
                """.formatted(inventory.get("armor").toString(),
                inventory.get("weapon").toString(),
                inventory.get("consumable").toString(),
                inventory.get("keyitem").toString());
    }

    public ArrayList<Item> getCategoryList( String category){
        return inventory.get(category);
    }

    public int getActualWeight() {
        return actualWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
