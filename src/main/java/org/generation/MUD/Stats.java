package org.generation.MUD;

public class Stats {
    private int vitality;
    private int strength;
    private int dexterity;
    private int critRate;
    private int defense;
    private int mp;

    public Stats(int vitality, int strength, int dexterity, int critRate, int defense, int mp) {
        this.vitality = vitality;
        this.strength = strength;
        this.dexterity = dexterity;
        this.critRate = critRate;
        this.defense = defense;
        this.mp = mp;
    }

    public int getVitality() {
        return vitality;
    }

    public void setVitality(int vitality) {
        this.vitality = vitality;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getCritRate() {
        return critRate;
    }

    public void setCritRate(int critRate) {
        this.critRate = critRate;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
