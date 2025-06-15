package org.lld.tictaktoe.models;

import java.util.Scanner;

public class Human extends Player{

    private int coins;
    private int level;
    private Scanner scanner;

    public Human(String name, Symbol symbol) {
        super(name, symbol, PlayerType.HUMAN);
        this.coins = 100;
        this.level = 1;
        this.scanner = new Scanner(System.in);
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

    @Override
    public Move makeMove(Board board) {
        System.out.printf("%s, please enter your move (row and column): ", getName());
        System.out.println();
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        return new Move(new Cell(row, col), this);
    }
}
