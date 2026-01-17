package org.generation.MUD.Inventory;

import org.generation.MUD.item.*;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.HashMap;

public class Inventory {
    protected HashMap<ItemCategory, ArrayList<Item>> inventory = new HashMap<>();
    protected final int maxWeight = 50;
    protected double actualWeight;

    public Inventory() {
        inventory.put(ItemCategory.ARMOR, new ArrayList<>());
        inventory.put(ItemCategory.WEAPON, new ArrayList<>());
        inventory.put(ItemCategory.KEYITEM, new ArrayList<>());
        inventory.put(ItemCategory.CONSUMABLE, new ArrayList<>());
    }

    /**
     * Prova ad aggiungere un oggetto all'inventario
     * @param toInsert L'oggetto da aggiungere
     * @return {@code True} se l'oggetto è stato aggiunto, {@code False} altrimenti
     */
    public boolean addItem(Item toInsert) {
        if (toInsert.getWeight() + actualWeight > maxWeight) {
            return false;
        }
        switch (toInsert) {
            case Armor a -> inventory.get(ItemCategory.ARMOR).add(a);
            case Weapon w -> inventory.get(ItemCategory.WEAPON).add(w);
            case Consumable c -> inventory.get(ItemCategory.CONSUMABLE).add(c);
            case KeyItem k -> inventory.get(ItemCategory.KEYITEM).add(k);
            default -> {
                return false;
            }
        }
        actualWeight += toInsert.getWeight();
        return true;
    }

    public void removeItem(@NotNull Item toRemove) {
            inventory.get(toRemove.getCategory()).remove(toRemove);
    }

    @Override
    public String toString() {
//        String.format("feafaf", parametri);stessa cosa di
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
                """.formatted(inventory.get(ItemCategory.ARMOR).toString(),
                inventory.get(ItemCategory.WEAPON).toString(),
                inventory.get(ItemCategory.CONSUMABLE).toString(),
                inventory.get(ItemCategory.KEYITEM).toString());
    }

    public ArrayList<Item> getCategoryList(ItemCategory category) {
        return inventory.get(category);
    }

    public double getActualWeight() {
        return actualWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }
}
