package org.generation.MUD.item;

import java.util.HashMap;

public class ArmorTypes {
    public HashMap<String, Armor> armorTypes = new HashMap<>();

    //Creiamo una mappa di armi predefinite da cui poter attingere in ogni parte del gioco
    public ArmorTypes() {
        armorTypes.put("stracci", new Armor("Stracci", 3, "Stracci trovati in giro, protezione minima", 4, "ebola", 0, 1));
        armorTypes.put("tunica", new Armor("Tunica", 5, "Tunica di cotone, protezione media", 6, "Cotone magico", 2, 1));
        armorTypes.put("cappuccio", new Armor("Cappuccio", 7, "Cappuccio di seta, morbido e silenzioso. Protezione media", 8, "seta", 1, 2));
        armorTypes.put("armatura_cuoio", new Armor("Armatura cuoio", 10, "Armatura di cuoio, protezione fisica sopra la media", 10, "cuoio", 0, 3));
        armorTypes.put("armatura_ferro", new Armor("Armatura ferro", 15, "Armatura di ferro, protezione elevata", 12, "ferro", 2, 2));
    }
}
