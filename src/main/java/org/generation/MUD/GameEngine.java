package org.generation.MUD;

/*
    QUESTA E' LA VERA MAIN!!!
 */

import org.generation.MUD.interactable.Interactable;
import org.generation.MUD.npc.NPCTypes;
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
        currentRoom = RoomTypes.map.get("pianura1");
        changeRoom("menù-iniziale");

        while (true) {
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
                if (azione.length != 2) {
                    return false;
                }
            }
            case RoomActions.TALK -> {
                if (azione.length != 2) {
                    IO.println("Sintassi errata.");
                    return false;
                }
                if (!currentRoom.getNpcs().contains(azione[1])) {
                    IO.println("Non ci sono NPC con questo nome.");
                    return false;
                }
                Utilities.stampaDialogoAMacchina(NPCTypes.map.get(azione[1]).getNextDialogue());
            }
            case RoomActions.COLLECT -> {
                if (azione.length != 2) {
                    return false;
                }
            }
            case RoomActions.USE_ITEM -> {
                if (azione.length != 2) {
                    return false;
                }
            }
            case RoomActions.EXPLORE -> {
                if (azione.length != 1) {
                    return false;
                }
                Utilities.stampaAMacchina(currentRoom.getExploreText());
            }
            case RoomActions.INTERACT -> {
                if (azione.length != 2) {
                    IO.println("Sintassi errata.");
                    return false;
                }

                for (Interactable object : currentRoom.getInteractables() ) {
                    if (object.getName().equals(azione[1])){
                        object.interact(player, currentRoom);
                    }
                    return true;
                }

                IO.println("Non puoi interagire con questo oggetto.");
                return false;
            }
            case RoomActions.PRINT_EXITS -> {
                if (azione.length != 1) {
                    return false;
                }
                Utilities.stampaAMacchina(currentRoom.getExits().keySet().toString());
            }
            case RoomActions.CHANGE_ROOM -> {
                if (azione.length != 2) {
                    IO.println("Sintassi errata.");
                    return false;
                }
                if (!currentRoom.getExits().containsKey(azione[1])) {
                    IO.println("Non ci sono uscite con questo nome.");
                    return false;
                }
                changeRoom(azione[1]);
                return true;
            }
            case RoomActions.CHANGE_ROOM_DEBUG -> {
                if (azione.length != 2) {
                    return false;
                }
                changeRoomDebug(azione[1]);
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
        String idStanza = currentRoom.getExits().get(nomeUscita);
        currentRoom = RoomTypes.map.get(idStanza);
        currentRoom.enteredRoom(player);
    }

    public void changeRoomDebug(String idStanza) {
        currentRoom = RoomTypes.map.get(idStanza);
        currentRoom.enteredRoom(player);
    }
}
