package org.generation.MUD.interactable;

import org.generation.MUD.Player;
import org.generation.MUD.room.Room;

import java.util.UUID;

public abstract class Interactable {
    String name;
    abstract public void interact(Player player, Room currentRoom);
    abstract public String getName();
}
