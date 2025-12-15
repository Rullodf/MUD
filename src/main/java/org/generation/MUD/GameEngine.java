package org.generation.MUD;

/*
    QUESTA E' LA VERA MAIN!!!
 */

import org.generation.MUD.room.Room;
import org.generation.MUD.room.RoomActions;
import org.generation.MUD.room.RoomTypes;

import java.lang.reflect.Array;

public class GameEngine {

    Room currentRoom;
    RoomTypes roomTypes = new RoomTypes();
    Player player;

    public GameEngine() {
        player = new Player();
    }

    public void startGame() {
        currentRoom = roomTypes.roomsMap.get("startMenu");
        String comando;

        while (true){
            IO.println(currentRoom.getExits());
            comando = IO.readln();
            executeCommand(comando);
        }
    }

    public boolean executeCommand(String command) {
        // "comando parametro1 parametro2 ... parametroN" -> ["comando", "parametro1", "parametro2", ..., "parametroN"]}
        // "goto idStanza" -> ["goto", "idStanza"]
        String[] azione = command.split(" ");
        RoomActions azioneEnum = RoomActions.fromString(azione[0]);
        switch (azioneEnum) {
            case RoomActions.ATTACK -> {
            }
            case RoomActions.TALK -> {

            }
            case RoomActions.COLLECT -> {
            }
            case RoomActions.USE_ITEM -> {
            }
            case RoomActions.EXPLORE -> {
            }
            case RoomActions.CHANGE_ROOM -> {
                if (azione.length != 2) {
                    return false;
                }
                if (!currentRoom.getExits().contains(azione[1])) {
                    return false;
                }

                changeRoom(azione[1]);
                return true;
            }
            case null, default -> {
                return false;
            }
        }
        return false;
    }



    public void changeRoom(String idStanza) {
        currentRoom = roomTypes.roomsMap.get(idStanza);
        currentRoom.enteredRoom(player);

    }
}
