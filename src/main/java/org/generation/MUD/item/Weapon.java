package org.generation.MUD.item;

import org.generation.MUD.Inventory.ItemCategory;

import java.util.HashMap;

//LA CLASSE -->Weapon<-- CONTIENE LE INFORMAZIONI DELLE ARMI!!!!!!!!!!!!!!!!!
public class Weapon extends Item{
    protected int damagePhysical;
    protected int damageMagical;

    public Weapon(String name, double weight, String description, int price, int damagePhysical, int damageMagical) {
        super(name, weight, description, price);
        this.damagePhysical = damagePhysical;
        this.damageMagical = damageMagical;
    }
    @Override
    public ItemCategory getCategory() {
        return ItemCategory.WEAPON;
    }
}
