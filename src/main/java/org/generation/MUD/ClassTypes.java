package org.generation.MUD;

import org.generation.MUD.item.Weapon;
import org.generation.MUD.item.WeaponType;

import java.util.HashMap;
import java.util.Map;

//Creiamo una mappa di classi predefinite da cui poter attingere in ogni parte del gioco
public class ClassTypes {
    protected HashMap<String,ClassStats>classes=new HashMap<>();

    public ClassTypes() {
        WeaponType weaponType = new WeaponType();
        classes.put("paladin", new ClassStats(
                "Paladin",
                new Stats(
                        20,
                        12,
                        8,
                        16,
                        18,
                        12)));
        classes.put("mage", new ClassStats(
                "Mage",
                new Stats(
                        12,
                        8,
                        10,
                        16,
                        10,
                        18)));
        classes.put("assassin", new ClassStats(
                "Assassin",
                new Stats(
                        14,
                        15,
                        18,
                        20,
                        5,
                        10)));
        classes.put("bard", new ClassStats(
                "Bard",
                new Stats(
                        15,
                        11,
                        10,
                        12,
                        10,
                        15)));
    }
}
