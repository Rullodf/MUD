package org.generation.MUD.room;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//creiamo la hashmap da usare in ogni parte del gioco
public class RoomTypes {
    public HashMap<String, Room> roomsMap = new HashMap<>();

    public RoomTypes() {
        roomsMap.put("startMenu", new Room(
                "startMenu",
                "Menu Principale",
                "GIOCO SCHIFOMADO'",
                "GIOCO SCHIFOMADO",
                null,
                null,
                MapFromArgs("pianura", "pianura1")
        ));
        roomsMap.put("pianura1", new Room(
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
                null,
                null,
                MapFromArgs("sentiero", "tutorial")
        ));
        roomsMap.put("tutorial", new Room(
                "tutorial",
                "Sentiero",
                """
                        Durante il tuo cammino vieni assalito da un piccolo goblin sbavoso!!
                        """,
                "Torni indietro solo per infierire sul povero corpo del goblin.",
                arrayFromArgs("tutorialGoblin"),
                null,
                MapFromArgs("avanti", "stanzaSceltaClasse",
                        "indietro", "pianura1")
        ));
        roomsMap.put("stanzaSceltaClasse", new Room(
                "stanzaSceltaClasse",
                "Sentiero",
                """
                        Una strana figura ti si para davanti, riesci a malapena ad intravedere i lineamenti del \
                        viso per via dell' enorme cappuccio malandato
                        """,
                "Torni nel luogo dove hai incontrato l'uomo misterioso, ma non lo trovi più...",
                arrayFromArgs("riccardoInIncognito"),
                null,
                MapFromArgs("indietro", "tutorial")
        ));
    }

    public ArrayList<String> arrayFromArgs(String... args) {
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
    public HashMap<String, String> MapFromArgs(String... args) {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < args.length; i += 2) {
            map.put(args[i], args[i + 1]);
        }

        return map;
    }
}
