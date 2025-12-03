package org.generation.MUD.item;

import java.util.HashMap;

//Creiamo una mappa di armi predefinite da cui poter attingere in ogni parte del gioco
public class WeaponType {
    public HashMap<String, Weapon> weapon= new HashMap<>();

    public WeaponType() {
        weapon.put("purificatore", new Weapon("Alabarda",10, "", 200, 7,3));
        weapon.put("molinari", new Weapon("Bacchetta", 10, "", 200,7,3));
        weapon.put("peroni", new Weapon("Coltello", 10, "", 200,7,3));
    }
}
