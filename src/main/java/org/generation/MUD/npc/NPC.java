package org.generation.MUD.npc;

import org.generation.MUD.Stats;
import org.generation.MUD.item.Item;

import java.util.ArrayList;
import java.util.List;

public class NPC {
    protected String nome;
    protected Stats stats;
    /**
     * Insieme di dialoghi che si attiveranno consecutivamente a ogni TALK con l'NPC
     * La seconda lista serve per non far stampare un dialogo tutto in una volta, ma per stamparlo spezzettato
     */
    protected List<List<String>> dialogueList;
    protected int dialogueIndex;
    protected String shoppingDialogue;
    protected List<Item> inventory;

    public NPC(String nome, Stats stats, List<List<String>> dialogueList, String shoppingDialogue, List<Item> inventory) {
        this.nome = nome;
        this.stats = stats;
        this.dialogueList = dialogueList;
        this.inventory = inventory;
        this.dialogueIndex = -1;
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

    public List<String> getNextDialogue() {
        if(dialogueIndex + 1 < dialogueList.size()){
            dialogueIndex++;
        }

        return dialogueList.get(dialogueIndex);
    }

    public String getShoppingDialogue() {
        return shoppingDialogue;
    }
}
