package org.generation.MUD.item.effect;

import org.generation.MUD.Player;

public abstract class porcoddio {
    int value;
    public void printValue(){
        System.out.println(value);
    }

    public abstract void applyEffect(Player player);
}
