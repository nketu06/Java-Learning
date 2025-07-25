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
        this.gameState = GameState.IN_PROGRESS;
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

    public boolean validate(Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();
        if (row < 0 || row >= size || col < 0 || col >= size) {
            System.out.println("Invalid move: Cell out of bounds.");
            return false;
        }
        Cell cell = board.getGrid().get(row).get(col);
        if(cell.getCellState() == CellState.EMPTY){
            return true;
        }
        return false;
//        return move.getCell().getCellState().equals(CellState.EMPTY);
    }

    public void updateGameState(Move move, Player currentPlayer) {
        // udate the cell on the board;
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();
        Cell cellToChange = board.getGrid().get(row).get(col);
        cellToChange.setCellState(CellState.FILLED);
        cellToChange.setSymbol(currentPlayer.getSymbol());

        move.setCell(cellToChange);
        move.setPlayer(currentPlayer);
        moves.add(move);

        nextPlayerIndex++;
        nextPlayerIndex %= players.size();

    }

    public boolean checkWinner(Move move) {
        for (WinningStrategy strategy : winningStrategies) {
            if(strategy.checkWinner(board, move)) {
                return true;
            }
        }
        return false;
    }

    public boolean makeMove() {
        Player currentPlayer = players.get(nextPlayerIndex);
        System.out.printf("%s's turn.\n", currentPlayer.getName());

        Move move = currentPlayer.makeMove(board);
        if (!validate(move)) {
            System.out.println("Invalid move. Try again.");
            return false;
        }

        updateGameState(move, currentPlayer);
        if (checkWinner(move)) {
            winner = currentPlayer;
            gameState = GameState.SUCCESS;
            System.out.printf("Game Over! %s wins!\n", winner.getName());
        }else if (moves.size() == size * size) {
            gameState = GameState.DRAW;
            System.out.println("Game Over! It's a draw!");
        } else {
            gameState = GameState.IN_PROGRESS;
        }
        return true;
    }

    public void undo() {
        if(moves.size() == 0){
            System.out.println("No moves to undo.");
            return;
        }
        Move lastMove = moves.remove(moves.size() - 1);
        lastMove.getCell().setCellState(CellState.EMPTY);
        lastMove.getCell().setSymbol(null);
        nextPlayerIndex--;

//        if (nextPlayerIndex < 0) {
//            nextPlayerIndex = players.size() - 1;
//        }
//        (a-b)%n = (a-b+n)%n
        nextPlayerIndex = (nextPlayerIndex + players.size()) % players.size() ;// ensure nextPlayerIndex is always valid
        for (WinningStrategy strategy : winningStrategies) {
            strategy.handleUndo(board, lastMove);
        }

        gameState = GameState.IN_PROGRESS;
        winner = null;



    }
}
