package org.generation.MUD.item;

import java.util.HashMap;

//LA CLASSE -->Weapon<-- CONTIENE LE INFORMAZIONI DELLE ARMI!!!!!!!!!!!!!!!!!
public class Weapon extends Item{
    protected int damagePhysical;
    protected int damageMagical;

    public Weapon(String name, double weight, String description, int price, int damagePhysical, int damageMagical) {
        super(name, weight, description, price);
        this.category = "weapon";
        this.damagePhysical = damagePhysical;
        this.damageMagical = damageMagical;
    }
}
