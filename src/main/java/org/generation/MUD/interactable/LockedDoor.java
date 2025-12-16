package org.generation.MUD.interactable;

import org.generation.MUD.Player;
import org.generation.MUD.item.KeyItem;
import org.generation.MUD.room.Room;

public class LockedDoor implements Interactable {

    KeyItem keyItem;
    boolean isLocked;
    String connectedRoomName;
    String connectedRoomID;

    public LockedDoor(KeyItem keyItem, String connectedRoomName, String connectedRoomID) {
        this.keyItem = keyItem;
        this.isLocked = true;
        this.connectedRoomName = connectedRoomName;
        this.connectedRoomID = connectedRoomID;
    }

    @Override
    public void interact(Player player, Room currentRoom) {
        if (player.getInventory().getCategoryList("keyitem").contains(keyItem)) {
            isLocked = false;
            currentRoom.getExits().put(connectedRoomName, connectedRoomID);
            IO.println("La porta è stata aperta! Hai accesso ad un nuovo percorso.");
            return;
        }
        IO.println("Non hai la chiave per aprire questa porta.");

        // exits ["sentiero","buco-nel-muro",""]
    }
}
