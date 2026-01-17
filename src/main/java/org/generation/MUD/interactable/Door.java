package org.generation.MUD.interactable;

import org.generation.MUD.Inventory.ItemCategory;
import org.generation.MUD.Player;
import org.generation.MUD.Utilities;
import org.generation.MUD.room.Room;
import org.generation.MUD.room.RoomTypes;

import java.util.ArrayList;
import java.util.List;

public class Door extends Interactable {


    String keyItem;
    boolean isKeyLocked;
    boolean isSideLocked;
    boolean isLockOnB;
    boolean isOpen;
    String roomAName;
    String roomAID;
    String roomBName;
    String roomBID;

    // Costruttore per porte chiuse con chiave
    public Door(String keyItem, String name, String roomAName, String roomAID, String roomBName, String roomBID) {
        this.keyItem = keyItem;
        this.name = name;
        this.isKeyLocked = true;
        this.isSideLocked = false;
        this.roomAName = roomAName;
        this.roomAID = roomAID;
        this.roomBName = roomBName;
        this.roomBID = roomBID;
        this.isOpen = false;
    }

    // Costruttore per porte chiuse solo da un lato
    public Door(boolean isLockOnB, String name, String roomAName, String roomAID, String roomBName, String roomBID) {
        this.isKeyLocked = false;
        this.isSideLocked = true;
        this.name = name;
        this.isLockOnB = isLockOnB;
        this.roomAName = roomAName;
        this.roomAID = roomAID;
        this.roomBName = roomBName;
        this.roomBID = roomBID;
        this.isOpen = false;
    }

    @Override
    public void interact(Player player, Room currentRoom) {
        if (isOpen) {
            Utilities.stampaAMacchina("La porta è gia aperta");
            return;
        }
        if (isSideLocked) {
            if (isLockOnB) {
                if (!currentRoom.getId().equals(roomBID)) {
                    Utilities.stampaAMacchina("Non si apre da questo lato");
                    return;
                }
                isOpen = true;
            } else {
                if (!currentRoom.getId().equals(roomAID)) {
                    Utilities.stampaAMacchina("Non si apre da questo lato");
                    return;
                }
                isOpen = true;
            }
        } else {
            if (!player.getInventory().getCategoryList(ItemCategory.KEYITEM).contains(keyItem)) {
                Utilities.stampaAMacchina("Non hai la chiave per aprire questa porta.");
                return;
            }
        }
        // Connetto stanza A alla stanza B
        RoomTypes.map.get(roomBID).getExits().put(roomAName, roomAID);
        // Connetto stanza B alla stanza A
        RoomTypes.map.get(roomAID).getExits().put(roomBName, roomBID);

        Utilities.stampaAMacchina("La porta è stata aperta! Hai accesso ad un nuovo percorso.");
        return;
        // exits ["sentiero","buco-nel-muro",""]
    }

    public String getName() {
        return name;
    }
}
