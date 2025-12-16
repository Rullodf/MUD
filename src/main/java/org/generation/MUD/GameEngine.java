package org.generation.MUD;

/*
    QUESTA E' LA VERA MAIN!!!
 */

import org.generation.MUD.room.Room;
import org.generation.MUD.room.RoomActions;
import org.generation.MUD.room.RoomTypes;

import java.lang.reflect.Array;

public class GameEngine {

    Room currentRoom;   //oggetto che si riferisce alla stanza attuale in cui si trova il player
    RoomTypes roomTypes = new RoomTypes();  //oggetto che contiene le stanze del MUD
    Player player;

    public GameEngine() {
        player = new Player();
    }   //costruttore che inizializza il player

    //la main principale!
    public void startGame() {
        Utilities.setLengthMax(30);
        String comando;
        currentRoom = roomTypes.roomsMap.get("pianura1");
        changeRoom("menù-iniziale");

        while (true){
            comando = IO.readln("> ");
            executeCommand(comando);
        }
    }

    /*
    funzione che prende come input il "comando(enum)+stanza(descrizione)" scritta da terminale dall'utente, e tramite lo
    switch, fa corrispondere ad un determinato enum un'azione
     */
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
                if (azione.length != 1) {
                    return false;
                }

            }
            case RoomActions.PRINT_EXITS -> {
                if (azione.length != 1) {
                    return false;
                }
                Utilities.stampaAMacchina(currentRoom.getExits().keySet().toString());
            }
            case RoomActions.CHANGE_ROOM -> {
                if (azione.length != 2) {
                    return false;
                }
                if (!currentRoom.getExits().containsKey(azione[1])) {
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
    /*
    funzione che serve per cambiare stanza. il parametro è la stanza passata dalla funzione 'executeCommmand'
     */
    public void changeRoom(String nomeUscita) {
        IO.println("\033[2J\033[H"); //questo print è per fare il clear del terminale \033[2J e riportare il cursore in cima \033[H
        String idStanza = currentRoom.getExits().get(nomeUscita);
        currentRoom = roomTypes.roomsMap.get(idStanza);
        currentRoom.enteredRoom(player);
    }
}
