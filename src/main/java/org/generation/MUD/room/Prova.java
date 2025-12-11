package org.generation.MUD.room;

import java.util.HashMap;

public class Prova {
    HashMap<java.lang.String, Test> map = new HashMap<>();

    public Prova() {
        map.put("a", new Test("a", "b"));
        map.put("b", new Test("b", "a"));
    }

    static void main() {
        Prova p = new Prova();

        Test a = p.map.get("a");
        Test b = p.map.get(a.nomeACuiECollegato);
    }
}

class Test {
    java.lang.String nome;
    String nomeACuiECollegato;

    public Test(java.lang.String nome, String nomeACuiECollegato) {
        this.nome = nome;
        this.nomeACuiECollegato = nomeACuiECollegato;
    }
}
