package org.generation.MUD.npc;

import org.generation.MUD.Stats;

import java.util.ArrayList;

public class NPC {
    protected String nome;
    protected Stats stats;
    protected ArrayList<String> dialogue;
    public NPC(String nome, Stats stats, ArrayList<String> dialogue) {
        this.nome = nome;
        this.stats = stats;
        this.dialogue = dialogue;
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
