package org.generation.MUD;

//Vi piacerebbe saperlo eh stronzi? la prossima volta siateci u.u
public enum RoomActions {
    ATTACK("att"),
    TALK("talk"),
    COLLECT("pick"),
    USE_ITEM("use"),
    EXPLORE("search"),
    CHANGE_ROOM("goto");

    String comando;

    RoomActions(String comando){
        this.comando = comando;
    }
}