package org.lld.tictaktoe.models;

public class Cell {
    private int row;
    private int column;
    private CellState cellState;
    private Symbol symbol;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
        this.cellState = CellState.EMPTY;
        this.symbol = null; // Assuming Symbol is a class that represents the symbol in the cell
    }
    public void display() {
        if (cellState == CellState.EMPTY) {
            System.out.print(" - ");
        } else {
            System.out.print(" " + symbol + " ");
        }
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }
}
