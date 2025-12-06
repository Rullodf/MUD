package org.generation.MUD;

import org.generation.MUD.item.Armor;
import org.generation.MUD.item.Weapon;

/*
QUESTA CLASSE--> CLASSSTATS <-- CONTIENE LE CLASSI BASE DEL MUD!!!!!!!!!!!!!!
Questa classe si occuperà semplicemente di contenere le proprietà che un player avrà di base una volta che ha scelto
la classe con la quale giocare
 */
public class ClassStats {
    private final String className;
    private Stats stats;
    private Weapon weapon;
    private Armor armor;

    
    public ClassStats(String className, Stats stats, Weapon weapon, Armor armor) {
        this.className = className;
        this.stats = stats;
        this.weapon = weapon;
        this.armor = armor;
    }

    public Stats getStats() {
        return stats;
    }

    public String getClassName() {
        return className;
    }
}
