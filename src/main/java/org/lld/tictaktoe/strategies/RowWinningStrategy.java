package org.lld.tictaktoe.strategies;

import org.lld.tictaktoe.models.Board;
import org.lld.tictaktoe.models.Move;
import org.lld.tictaktoe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public  class RowWinningStrategy implements WinningStrategy {

    Map<Integer, HashMap<Character,Integer>> rowCountMap;

    public RowWinningStrategy() {
        this.rowCountMap = new HashMap<>();
    }

    @Override
    public boolean checkWinner(Board board, Move move) {

        int row = move.getCell().getRow();
        Character ch = move.getPlayer().getSymbol().getChracter();
        if (!rowCountMap.containsKey(row)) {
            rowCountMap.put(row, new HashMap<>());

        }
        if (!rowCountMap.get(row).containsKey(ch)) {
            rowCountMap.get(row).put(ch, 0);
        }
        rowCountMap.get(row).put(ch, rowCountMap.get(row).get(ch) + 1);
        System.out.println(rowCountMap.get(row).get(ch));
        return rowCountMap.get(row).get(ch) == board.getSize();

    }

    @Override
    public void handleUndo(Board board, Move move) {
        // Undo the move by decrementing the count for the player's symbol in the row
        rowCountMap.get(move.getCell().getRow()).put(
                move.getPlayer().getSymbol().getChracter(),
                rowCountMap.get(move.getCell().getRow()).get(move.getPlayer().getSymbol().getChracter()) - 1
        );
    }
}
