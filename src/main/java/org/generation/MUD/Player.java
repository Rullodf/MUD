package org.generation.MUD;

/*
    LA CLASSE -> PLAYER <- CONTIENE LE CARATTERISTICHE DEL PLAYER!!!
 */
public class Player {
    String name;
    String gender;
    //Decidiamo di usare classStats come proprietà di player perchè contiene un gruppo di proprietà
    //che sono logicamente correlate tra loro e possono essere riusate da altre classi
    ClassStats classStats;          //Classe con stats di classe predefinite
    Stats playerStats;              //Stats attuali del giocatore
    Inventory inventory;
    int gold;


    public Player(String name, String gender, ClassStats classStats, Inventory inventory, Stats playerStats, int gold) {
        this.name = name;
        this.gender = gender;
        this.classStats = classStats;
        this.inventory = inventory;
        this.playerStats = playerStats;
        this.gold = gold ;
    }

    public Player(){
        this.name = "";
        this.gender = "";
        this.classStats = null;
        this.inventory = null;
        this.playerStats = null;
        this.gold = 0 ;
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
