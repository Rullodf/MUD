package org.generation.MUD;

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
    
   
}
