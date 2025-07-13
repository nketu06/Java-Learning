package org.lld.card.Models;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void displayCards() {
        for (Card card : cards) {
            card.showCard();
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card deal() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.removeFirst();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public int remainingCards() {
        return cards.size();
    }

}


