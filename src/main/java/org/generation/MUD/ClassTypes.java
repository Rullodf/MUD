package org.generation.MUD;

import org.generation.MUD.item.ArmorTypes;
import org.generation.MUD.item.WeaponTypes;

import java.util.HashMap;

//Creiamo una mappa di classi predefinite da cui poter attingere in ogni parte del gioco
public class ClassTypes {
    public static HashMap<String, ClassStats> classes = new HashMap<>();

    static {
        classes.put("paladin", new ClassStats(
                        "Paladin",
                        new Stats(
                                20,
                                12,
                                8,
                                16,
                                18,
                                12),
                        WeaponTypes.map.get("alabarda"),
                        ArmorTypes.map.get("armatura_ferro")
                )
        );
        classes.put("mage", new ClassStats(
                        "Mage",
                        new Stats(
                                12,
                                8,
                                10,
                                16,
                                10,
                                18),
                        WeaponTypes.map.get("bacchetta"),
                        ArmorTypes.map.get("tunica")
                )
        );
        classes.put("assassin", new ClassStats(
                        "Assassin",
                        new Stats(
                                14,
                                15,
                                18,
                                20,
                                5,
                                10),
                        WeaponTypes.map.get("pugnale"),
                        ArmorTypes.map.get("cappuccio")
                )
        );
        classes.put("bard", new ClassStats(
                        "Bard",
                        new Stats(
                                15,
                                11,
                                10,
                                12,
                                10,
                                15),
                        WeaponTypes.map.get("piffero"),
                        ArmorTypes.map.get("armatura_cuoio")
                )
        );
    }
}

/// ////////////////////// Abbiamo concluso la creazione delle classi predefinite
