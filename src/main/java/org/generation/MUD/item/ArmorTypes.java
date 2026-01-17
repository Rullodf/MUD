package org.generation.MUD.item;

import java.util.HashMap;

public class ArmorTypes {
    public static HashMap<String, Armor> map = new HashMap<>();

    //Creiamo una mappa di armi predefinite da cui poter attingere in ogni parte del gioco
    static {
        map.put("stracci", new Armor("Stracci", 3, "Stracci trovati in giro, protezione minima", 4, "ebola", 0, 1));
        map.put("tunica", new Armor("Tunica", 5, "Tunica di cotone, protezione media", 6, "Cotone magico", 2, 1));
        map.put("cappuccio", new Armor("Cappuccio", 7, "Cappuccio di seta, morbido e silenzioso. Protezione media", 8, "seta", 1, 2));
        map.put("armatura_cuoio", new Armor("Armatura cuoio", 10, "Armatura di cuoio, protezione fisica sopra la media", 10, "cuoio", 0, 3));
        map.put("armatura_ferro", new Armor("Armatura ferro", 15, "Armatura di ferro, protezione elevata", 12, "ferro", 2, 2));
    }
}
