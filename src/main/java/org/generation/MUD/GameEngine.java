package org.generation.MUD;

/*
    QUESTA E' LA VERA MAIN!!!
 */

import org.generation.MUD.room.Room;
import org.generation.MUD.room.RoomActions;

import java.lang.reflect.Array;

public class GameEngine {

    Room currentRoom;

    public boolean executeCommand(String command) {
        String[] azione = command.split(" ");
        RoomActions azioneEnum = RoomActions.fromString(azione[0]);
        switch (azioneEnum){
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
                if(azione.length !=2){
                    return false;
                }
                if(!currentRoom.getExits().contains(azione[1])){
                    return false;
                }
            }
            case null -> {}
        }
    }



    public void changeRoom(String idStanza) {
        currentRoom = roomTypes.roomsMap.get(idStanza);
        currentRoom.enteredRoom(player);

    }
}
