package org.lld.tictaktoe.models;

public class Symbol {
    private Character sym;

    public Symbol(Character sym) {
        this.sym = sym;
    }

    public Character getChracter() {
        return sym;
    }

    public void setChracter(Character symbol) {
        this.sym = symbol;
    }

    @Override
    public String toString() {
        return this.sym.toString();
    }
}
