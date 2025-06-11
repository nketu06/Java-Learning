package org.lld.tictaktoe.models;

public class Symbol {
    private Character sym;

    public Symbol(Character sym) {
        this.sym = sym;
    }

    public Character getSymbol() {
        return sym;
    }

    public void setSymbol(Character symbol) {
        this.sym = symbol;
    }
}
