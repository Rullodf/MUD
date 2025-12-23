package org.generation.MUD.Inventory;

public enum ItemCategory {
    ARMOR("armor"), CONSUMABLE("consumable"), KEYITEM("keyItem"), WEAPON("weapon");

    final String text;

    ItemCategory(String text) {
        this.text = text;
    }
}
