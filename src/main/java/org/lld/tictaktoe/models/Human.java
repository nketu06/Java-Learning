package org.lld.tictaktoe.models;

public class Human extends Player{

    private int coins;
    private int level;

    public Human(String name, Symbol symbol) {
        super(name, symbol, PlayerType.HUMAN);
        this.coins = 100;
        this.level = 1;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
