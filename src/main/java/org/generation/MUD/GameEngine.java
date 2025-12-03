package org.generation.MUD;

import org.generation.MUD.item.Consumable;
import org.generation.MUD.item.effect.AddMP;
import org.generation.MUD.item.effect.RemoveVitality;

public class GameEngine {
    public void StartGame() {

        ClassStats paladino = new ClassStats("Paladino",
                new Stats(10,10,10,10,10,10));

        Consumable c = new Consumable("Potion", 0.5, "Heals 10 HP", 10, 1,
                new AddMP(50),
                new RemoveVitality(20));

        c.useItem();
    }
}
