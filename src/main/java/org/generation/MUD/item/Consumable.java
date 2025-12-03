package org.generation.MUD.item;

import org.generation.MUD.Player;

public class Consumable extends Item{
    protected int quantity;


    public Consumable(String name, double weight, String description, int value, int quantity) {
        super(name, weight, description, value);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public void useItem(Player player){



        this.setQuantity(this.quantity - 1);
    }
}
