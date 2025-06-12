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

    public void display(){
        board.printBoard();

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

    public boolean validate(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();
        if (row < 0 || row >= size || col < 0 || col >= size) {
            System.out.println("Invalid move: Cell out of bounds.");
            return false;
        }
        return move.getCell().getCellState() == CellState.EMPTY;
    }

    public void makeMove() {
        Player currentPlayer = players.get(nextPlayerIndex);
        System.out.printf("%s's turn.", currentPlayer.getName());
        Move move = currentPlayer.makeMove(board);
        if (!validate(move)) {
            System.out.println("Invalid move. Try again.");
            return;
        }


    }
}
