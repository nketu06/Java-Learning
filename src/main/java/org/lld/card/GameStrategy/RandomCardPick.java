package org.lld.card.GameStrategy;

import org.lld.card.Models.Card;
import org.lld.card.Models.Player;

import java.util.List;
import java.util.Random;

public class RandomCardPick implements CardPick {

    Random random = new Random();

    @Override
    public Card selectCard(Player player) {
        List<Card> list =player.getHand();
        if (list.isEmpty()) return null;
        int index = random.nextInt(list.size()); // random index in range [0, size)
        return list.remove(index);
    }
}
