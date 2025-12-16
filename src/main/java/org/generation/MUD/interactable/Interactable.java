package org.generation.MUD.interactable;

import org.generation.MUD.Player;
import org.generation.MUD.room.Room;

public interface Interactable {
    void interact(Player player, Room currentRoom);
}
