package org.lld.card.Models;

public enum Suit {
    DIAMOND("diamond"),
    HEARTS("heart"),
    SPADES("spade"),
    CLUBS("clubs");
    private final String displayName;

    Suit(String displayName) {
        this.displayName = displayName;
    }
    @Override
    public String toString() {
        return displayName;
    }

}
