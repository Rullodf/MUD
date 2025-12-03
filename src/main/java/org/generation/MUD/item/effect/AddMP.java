package org.generation.MUD.item.effect;

import org.generation.MUD.Player;

public class AddMP extends Effect {
    public AddMP(int value) {
        super(value);
    }
    @Override
    public void applyEffect(Player player) {
        player.getPlayerStats().setMp(player.getPlayerStats().getMp() + value);
    }
}
