package org.generation.MUD.room;

import java.util.ArrayList;
import java.util.HashMap;

//creiamo la hashmap da usare in ogni parte del gioco
public class RoomTypes {
    HashMap<String, Room> roomTypes = new HashMap<>();

    public RoomTypes() {
        HashMap<String, Room> exits = new HashMap<>();
        roomTypes.put("start_menu", new Room(
                "start_menu",
                "Menu Principale",
                "GIOCO SCHIFOMADO'",
                null,
                null,
                arrayFromArgs("pianura", "settings")
        ));
//        roomTypes.put("pianura", new Room(
//                "pianura1",
//        """
//                Ti risvegli in una vasta pianura desolata. Ti guardi intorno e non riesci a vedere
//                """
//        ))
    }

    public ArrayList<String> arrayFromArgs(String... args) {
        ArrayList<String> list = new ArrayList<>();
        for (String arg : args) {
            list.add(arg);
        }
        return list;
    }
}
