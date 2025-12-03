package org.generation.MUD.item;

import java.util.HashMap;

public class WeaponType {
    HashMap<String, Weapon> weapon= new HashMap<>();

    public WeaponType() {
        weapon.put("purificatore", new Weapon("Alabarda", 7,3));
        weapon.put("molinari", new Weapon("Bacchetta", 3,7));
        weapon.put("peroni", new Weapon("Coltello", 7,3));
    }
}
