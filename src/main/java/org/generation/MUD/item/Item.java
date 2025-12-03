package org.generation.MUD.item;

import org.generation.MUD.Player;

public class Item {
    protected String name, description;
    protected double weight;
    protected int value;

    public Item(String name, double weight, String description, int value) {
        this.name = name;
        this.weight = weight;
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void useItem(Player player){

    }
}
