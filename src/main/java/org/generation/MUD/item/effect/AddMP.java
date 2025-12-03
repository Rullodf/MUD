package org.generation.MUD.item.effect;

import org.generation.MUD.Player;

public class AddMP extends Effect {
    int value;
    public AddMP(int value){
        this.value = value;
    }
    @Override
    public void applyEffect(Player player) {
        player.getPlayerStats().setMp(player.getPlayerStats().getMp() + value);
    }
}
