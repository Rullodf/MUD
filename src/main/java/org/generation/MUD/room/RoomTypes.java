package org.generation.MUD.room;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//creiamo la hashmap da usare in ogni parte del gioco
public class RoomTypes {
    HashMap<String, Room> roomTypes = new HashMap<>();

    public RoomTypes() {
        roomTypes.put("startMenu", new Room(
                "startMenu",
                "Menu Principale",
                "GIOCO SCHIFOMADO'",
                "GIOCO SCHIFOMADO",
                null,
                null,
                arrayFromArgs("pianura1", "settings")
        ));
        roomTypes.put("pianura", new Room(
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
                arrayFromArgs("startMenu", "settings", "tutorial")
        ));
        roomTypes.put("tutorial", new Room(
                "tutorial",
                "Sentiero",
                """
                        Durante il tuo cammino vieni assalito da un piccolo goblin sbavoso!!
                        """,
                "Torni indietro solo per infierire sul povero corpo del goblin.",
                arrayFromArgs("tutorialGoblin"),
                null,
                arrayFromArgs("startMenu", "stanzaSceltaClasse", "pianura1", "settings")
        ));
        roomTypes.put("stanzaSceltaClasse", new Room(
                "stanzaSceltaClasse",
                "Sentiero",
                """
                        Una strana figura ti si para davanti, riesci a malapena ad intravedere i lineamenti del \
                        viso per via dell' enorme cappuccio malandato
                        """,
                "Torni nel luogo dove hai incontrato l'uomo misterioso, ma non lo trovi più...",
                arrayFromArgs("riccardoInIncognito"),
                null,
                arrayFromArgs("startMenu", "tutorial", "settings")
        ));
    }

    public ArrayList<String> arrayFromArgs(String... args) {
        ArrayList<String> list = new ArrayList<>();

        for (String arg : args) {
            list.add(arg);
        }
//        Collections.addAll(list, args); //Equivalente del for sopra
        return list;
    }
}
