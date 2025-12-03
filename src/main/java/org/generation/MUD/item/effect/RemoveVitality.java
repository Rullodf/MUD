package org.generation.MUD.item.effect;

import org.generation.MUD.Player;

public class RemoveVitality extends Effect{
    public RemoveVitality(int value) {
        super(value);
    }
    @Override
    public void applyEffect(Player player){
        player.getPlayerStats().setVitality(player.getPlayerStats().getVitality() - value);
    }

}
