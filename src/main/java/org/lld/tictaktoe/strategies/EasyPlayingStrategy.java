package org.lld.tictaktoe.strategies;

import org.lld.tictaktoe.models.*;

public class EasyPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board, Player botPlayer) {
        // Easy strategy: Find the first empty cell and place the symbol there
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                Cell cell = board.getGrid().get(i).get(j);
                if (cell.getCellState() == CellState.EMPTY) {
                    return new Move(new Cell(i,j), botPlayer);
                }
            }
        }
        return null;
    }
}
