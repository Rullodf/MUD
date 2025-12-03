package org.generation.MUD.item;

import org.generation.MUD.Player;
import org.generation.MUD.item.effect.AddMP;
import org.generation.MUD.item.effect.Effect;
import org.generation.MUD.item.effect.RemoveVitality;

import java.util.ArrayList;
import java.util.Arrays;

public class Consumable extends Item {
    protected int quantity;
    ArrayList<Effect> effects;

    public Consumable(String name, double weight, String description, int value, int quantity, Effect... effects) {
        super(name, weight, description, value);
        this.quantity = quantity;
        this.effects = new ArrayList<>();
        for(Effect effect : effects){
            this.effects.add(effect);
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void useItem(Player player) {

        for (Effect effect : effects) {
            effect.applyEffect(player);
        }

        this.setQuantity(this.quantity - 1);
    }
}
