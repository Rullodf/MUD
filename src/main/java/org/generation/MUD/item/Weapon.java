package org.generation.MUD.item;

import java.util.HashMap;

public class Weapon {
    protected String name;
    protected int damagePhysical;
    protected int damageMagical;

    public Weapon(String name, int damagePhysical, int damageMagical) {
        this.name = name;
        this.damagePhysical = damagePhysical;
        this.damageMagical = damageMagical;
    }

}
