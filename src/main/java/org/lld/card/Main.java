package org.lld.card;

import org.lld.card.Models.Deck;

public class Main {
    public static void main(String[] args) {
        System.out.println("   **** Game started ****   ");
        Deck deck = new Deck();
        deck.displayCards();
    }
}
