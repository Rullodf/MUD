package org.generation.MUD.item.effect;

import org.generation.MUD.Player;

public class AddMP extends Effect {
    void applyEffect(Player player, int value) {
        player.getPlayerStats().setMp(player.getPlayerStats().getMp() + value);
    }
}
