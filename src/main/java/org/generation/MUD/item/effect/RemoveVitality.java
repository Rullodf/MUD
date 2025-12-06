package org.generation.MUD.item.effect;

import org.generation.MUD.Player;

import java.util.HashMap;

public class RemoveVitality implements Effect{
    int value;
    public RemoveVitality(int value){
        this.value = value;
    }
    @Override
    public void applyEffect(Player player){
        player.getPlayerStats().setVitality(player.getPlayerStats().getVitality() - value);
    }

}
