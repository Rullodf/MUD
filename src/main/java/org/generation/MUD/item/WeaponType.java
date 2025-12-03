package org.generation.MUD.item;

import java.util.HashMap;

//Creiamo una mappa di armi predefinite da cui poter attingere in ogni parte del gioco
public class WeaponType {
    public HashMap<String, Weapon> weapon= new HashMap<>();

    public WeaponType() {
        weapon.put("purificatore", new Weapon("Alabarda",10, "", 50, 7,3));
        weapon.put("molinari", new Weapon("Bacchetta", 10, "", 40,7,3));
        weapon.put("peroni", new Weapon("Coltello", 10, "", 20,7,3));
        weapon.put("dolcefiaba", new Weapon("piffero", 10, "",10,4,9) );
        weapon.put("spezzapassi", new Weapon("forchetta",1, "",1,2,0 ));

    }
}
