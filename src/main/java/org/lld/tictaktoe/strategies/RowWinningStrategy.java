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
}
