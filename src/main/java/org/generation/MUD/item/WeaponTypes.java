package org.generation.MUD.item;

import java.util.HashMap;

//Creiamo una mappa di armi predefinite da cui poter attingere in ogni parte del gioco
public class WeaponTypes {
    public HashMap<String, Weapon> weapon= new HashMap<>();

    public WeaponTypes() {
        weapon.put("alabarda", new Weapon("Alabarda",14, "", 50, 7,3));
        weapon.put("bacchetta", new Weapon("Bacchetta", 9, "", 40,7,3));
        weapon.put("pugnale", new Weapon("Pugnale", 3, "", 20,7,3));
        weapon.put("claymore", new Weapon("Claymore", 20, "", 10,10,0));
        weapon.put("piffero", new Weapon("piffero", 4, "",10,4,9) );
        weapon.put("forchetta", new Weapon("forchetta",1, "",1,2,0 ));

    }
}
