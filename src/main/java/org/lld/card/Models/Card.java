package org.lld.card.Models;

public class Card {

    Rank rank;

    Suit suit;

    Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public void showCard() {
        System.out.println(rank + " " + suit);
    }
}
