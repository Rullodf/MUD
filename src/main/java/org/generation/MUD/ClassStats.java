package org.generation.MUD;
/*
QUESTA CLASSE--> CLASSSTATS <-- CONTIENE LE CLASSI BASE DEL MUD!!!!!!!!!!!!!!
 */
public class ClassStats {
    private final String className;
    private Stats stats;
    
    public ClassStats(String className, Stats stats) {
        this.className = className;
        this.stats = stats;
    }

    public Stats getStats() {
        return stats;
    }

    public String getClassName() {
        return className;
    }
}
