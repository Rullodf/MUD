package org.generation.MUD.room;

import org.generation.MUD.Utilities;
import org.generation.MUD.interactable.Door;
import org.generation.MUD.interactable.DoorTypes;
import org.generation.MUD.npc.NPC;
import org.generation.MUD.npc.NPCTypes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//creiamo la hashmap da usare in ogni parte del gioco
public class RoomTypes {
    static public HashMap<String, Room> map = new HashMap<>();

    static {
        map.put("startMenu", new Room(
                "startMenu",
                "Menu Principale",
                "GIOCO SCHIFOMADO'",
                "GIOCO SCHIFOMADO",
                "",
                null,
                null,
                null,
                mapFromArgs("pianura", "pianura1")
        ));
        map.put("pianura1", new Room(
                "pianura1",
                "Pianura",
                """
                        Ti risvegli in una vasta pianura desolata. Ti guardi intorno e non riesci a vedere nient'altro \
                        che una distesa d'erba...
                        L'unica cosa che coglie la tua attenzione è un lungo sentiero
                        """,
                """
                        Fenomeno , sei tornato all' inizio
                        """,
                "Trovi una porta davanti a te, e una chiave per terra",
                null,
                null,
                null,
                //TODO reinserire "sentiero", "tutorial"
                mapFromArgs()
        ));
        map.put("tutorial", new Room(
                "tutorial",
                "Sentiero",
                """
                        Durante il tuo cammino vieni assalito da un piccolo goblin sbavoso!!
                        """,
                "Torni indietro solo per infierire sul povero corpo del goblin.",
                "",
                arrayFromArgs("tutorialGoblin"),
                null,
                null,
                //TODO reinserire "avanti", "stanzaSceltaClasse",
                mapFromArgs(
                        "indietro", "pianura1")
        ));
        map.put("stanzaSceltaClasse", new Room(
                "stanzaSceltaClasse",
                "Sentiero",
                """
                        Una strana figura ti si para davanti, riesci a malapena ad intravedere i lineamenti del \
                        viso per via dell' enorme cappuccio malandato
                        """,
                "Torni nel luogo dove hai incontrato l'uomo misterioso, ma non lo trovi più...",
                "",
                arrayFromArgs("riccardoTutorial"),
                null,
                null,
                mapFromArgs("indietro", "tutorial"),
                player -> {
                    NPC riccardo =  NPCTypes.map.get("riccardoTutorial");
                    Utilities.stampaDialogoAMacchina(riccardo.getNextDialogue());
                    //dialogo col bro
                    //input dall'utente per scegliere la classe
                    //riassegnazione delle stats e aggiornamento inventario
                }
        ));
        DoorTypes.applyDoors();
    }

    public static ArrayList<String> arrayFromArgs(String... args) {
        ArrayList<String> list = new ArrayList<>();

//        for (String arg : args) {
//            list.add(arg);
//        }
        Collections.addAll(list, args); //Equivalente del for sopra
        return list;
    }

    /**
     * Crea una mappa da argomenti passati come coppie di chiave-valore
     *
     * @param args
     * @return
     */
    public static HashMap<String, String> mapFromArgs(String... args) {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < args.length; i += 2) {
            map.put(args[i], args[i + 1]);
        }

        return map;
    }
}
