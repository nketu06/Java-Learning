package org.lld.tictaktoe.strategies;

import org.lld.tictaktoe.models.Board;
import org.lld.tictaktoe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
    void handleUndo(Board board, Move move);
}
