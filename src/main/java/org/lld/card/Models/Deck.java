package org.lld.card.Models;

import java.util.ArrayList;

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
}


