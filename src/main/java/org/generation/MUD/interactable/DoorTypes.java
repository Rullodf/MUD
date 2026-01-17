package org.generation.MUD.interactable;

import org.generation.MUD.room.RoomTypes;

import java.util.ArrayList;
import java.util.List;

public class DoorTypes {

    public static List<Door> doors = new ArrayList<Door>();

    static {
        doors.add(new Door(false, "porta", "indietro", "pianura1", "sentiero", "tutorial"));
    }

    public static void applyDoors() {
        for (Door door : doors) {
            RoomTypes.map.get(door.roomBID).getInteractables().add(door);
            RoomTypes.map.get(door.roomAID).getInteractables().add(door);
        }
    }
}
