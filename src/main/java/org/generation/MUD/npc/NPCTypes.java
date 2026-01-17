package org.generation.MUD.npc;

import org.generation.MUD.Stats;
import org.generation.MUD.Utilities;

import java.util.HashMap;

public class NPCTypes {
    public static HashMap<String, NPC> map = new HashMap<>();

    static {
        NPCTypes.map.put("riccardoTutorial", new NPC(
                "Losco figuro",
                new Stats(
                       100,
                       100,
                       100,
                       100,
                       100,
                       100
                ),
                // List<List<String>>
                // List<T> listFromArgs(T... args)
                Utilities.listFromArgs(
                        // List<String>
                        // List<T> listFromArgs(T... args)
                        Utilities.listFromArgs(
                                " Oh, non mi aspettavo di vederti qua... ",
                                """
                                Che c'è, hai paura di un cappuccio?
                                Scusa, ma fidati... ti farei più paura senza ohohoh
                                *cough *cough """,
                                """
                                Hmmm, cos'è questo odore?
                                puzzi di sangue di goblin... vuol mica dire che quel maledetto ruba-panini è morto?!
                                NON CI CREDO, DOPO TUTTI QUESTI ANNI!""",
                                """
                                Mi hai reso un grande servizio, lascia che ti ripaghi in qualche modo.
                                Prendine solo uno però, non voglio mica diventare un barbone."""
                        ),
                        Utilities.listFromArgs(
                                """
                                AH , hai finalmente scelto la tua classe , nel frattempo io sono andato \
                                in Thailandia e ho visto un concerto.""",
                                """
                                Non supererai mai la mia riccarditudine""",
                                """
                                Suca"""),
                        Utilities.listFromArgs(
                                """
                                 Non c'ho voglia""",
                                """
                                Terzo dialogo"""
                        )
                ),
                "compra la droga",
                null
        ));
    }
}
