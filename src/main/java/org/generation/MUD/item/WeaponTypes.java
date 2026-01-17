package org.generation.MUD.item;

import java.util.HashMap;

//Creiamo una mappa di armi predefinite da cui poter attingere in ogni parte del gioco
public class WeaponTypes {
    public static HashMap<String, Weapon> map = new HashMap<>();

    static{
        map.put("alabarda", new Weapon("Alabarda",14, "", 50, 7,3));
        map.put("bacchetta", new Weapon("Bacchetta", 9, "", 40,7,3));
        map.put("pugnale", new Weapon("Pugnale", 3, "", 20,7,3));
        map.put("claymore", new Weapon("Claymore", 20, "", 10,10,0));
        map.put("piffero", new Weapon("piffero", 4, "",10,4,9) );
        map.put("forchetta", new Weapon("forchetta",1, "",1,2,0 ));

    }
}
