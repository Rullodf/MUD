package org.generation.MUD.npc;

import org.generation.MUD.Stats;
import org.generation.MUD.item.Item;

import java.util.ArrayList;
import java.util.List;

public class NPC {
    protected String nome;
    protected Stats stats;
    protected ArrayList<String> dialogue;
    protected String shoppingDialogue;
    protected List<Item> inventory = new ArrayList<>();
    protected int currentDialogueIndex = 0;
    public NPC(String nome, Stats stats, ArrayList<String> dialogue, String shoppingDialogue, List<Item> inventory) {
        this.nome = nome;
        this.stats = stats;
        this.dialogue = dialogue;
        this.shoppingDialogue = shoppingDialogue;
        this.inventory = inventory;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public ArrayList<String> getDialogue() {
        return dialogue;
    }

    public void setDialogue(ArrayList<String> dialogue) {
        this.dialogue = dialogue;
    }
}
