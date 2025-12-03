package org.generation.MUD;

/*
    LA CLASSE -> PLAYER <- CONTIENE LE CARATTERISTICHE DEL PLAYER!!!
 */
public class Player {
    String name;
    String gender;
    ClassStats classStats;    //Classe con stats di classe predefinite
    Stats playerStats;              //Stats attuali del giocatore
    Inventory inventory;
    
    public Player(String name, String gender, ClassStats classStats, Inventory inventory, Stats playerStats) {
        this.name = name;
        this.gender = gender;
        this.classStats = classStats;
        this.inventory = inventory;
        this.playerStats = playerStats;
    }

    public void takeHit(int damage){
        playerStats.setVitality(playerStats.getVitality() - damage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ClassStats getClassStats() {
        return classStats;
    }

    public void setClassStats(ClassStats classStats) {
        this.classStats = classStats;
    }

    public Stats getPlayerStats() {
        return playerStats;
    }

    public void setPlayerStats(Stats playerStats) {
        this.playerStats = playerStats;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }
}
