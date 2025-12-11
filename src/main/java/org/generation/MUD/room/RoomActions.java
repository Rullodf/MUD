package org.generation.MUD.room;

//Vi piacerebbe saperlo eh stronzi? la prossima volta siateci u.u fanculo
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