package org.lld.tictaktoe.models;

import org.lld.tictaktoe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    int size;
    private Board board;
    private List<Player> players;
    private int nextPlayerIndex;
    private Player winner;
    private List<Move> moves;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

    public Game(int size, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.size = size;
        this.board = new Board(size);
        this.players = players;
        this.nextPlayerIndex = 0;
        this.winner = null;
        this.moves = new ArrayList<>();
        this.winningStrategies = winningStrategies;
        this.gameState = GameState.TO_BE_STARTED;
    }

    public int getSize() {
        return size;
    }

    public Board getBoard() {
        return board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public Player getWinner() {
        return winner;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }
}
