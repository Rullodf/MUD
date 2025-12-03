package org.generation.MUD.item;

public class Armor extends Item{
    String material;
    int physicalDefense;
    int magicalDefense ;

    public Armor(String name, double weight, String description, int price, String material, int magicalDefense, int physicalDefense) {
        super(name, weight, description, price);
        this.material = material;
        this.magicalDefense = magicalDefense;
        this.physicalDefense = physicalDefense;
    }

}
