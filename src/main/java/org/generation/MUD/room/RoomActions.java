package org.generation.MUD.room;

//Vi piacerebbe saperlo eh stronzi? la prossima volta siateci u.u fanculo
public enum RoomActions {
    ATTACK("att"),
    TALK("talk"),
    COLLECT("pick"),
    INTERACT("interact"),
    USE_ITEM("use"),
    EXPLORE("search"),
    CHANGE_ROOM("goto"),
    CHANGE_ROOM_DEBUG("gotoid"),
    PRINT_EXITS("exits");

    final String comando;

    RoomActions(String comando){
        this.comando = comando;
    }

    /*
    funzione che verrà richiamata per prendere il valore dell'enum
     */
    public static RoomActions fromString(String text){
        for (RoomActions value : RoomActions.values()){
            if (value.comando.equals(text)){
                return value;
            }
        }
        return null;
    }
}