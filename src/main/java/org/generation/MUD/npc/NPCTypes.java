package org.generation.MUD.npc;

import org.generation.MUD.Stats;
import org.generation.MUD.Utilities;
import org.generation.MUD.item.ArmorTypes;
import org.generation.MUD.item.WeaponTypes;

import java.util.HashMap;

public class NPCTypes {
    public HashMap<String, NPC> npcsMap = new HashMap<>();
    ArmorTypes a = new ArmorTypes();
    WeaponTypes w = new WeaponTypes();

    public NPCTypes() {
        npcsMap.put("riccardoTutorial", new NPC(
                "Losco figuro",
                new Stats(
                       100,
                       100,
                       100,
                       100,
                       100,
                       100
                ),
                Utilities.listFromArgs(
                        "Oh, non mi aspettavo di vederti qua... ",
                        """
                        Che c'è, hai paura di un cappuccio?
                        Scusa, ma fidati... ti farei più paura senza ohohoh
                        *cough *cough
                        """,
                        """
                        Hmmm, cos'è questo odore?
                        puzzi di sangue di goblin... vuol mica dire che quel maledetto ruba-panini è morto?!
                        NON CI CREDO, DOPO TUTTI QUESTI ANNI!""",
                        """
                        Mi hai reso un grande servizio, lascia che ti ripaghi in qualche modo.
                        Prendine solo uno però, non voglio mica diventare un barbone."""
                        ),
                "compra la droga",
                null
        ));
    }
}
