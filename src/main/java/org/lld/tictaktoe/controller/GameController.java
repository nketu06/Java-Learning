package org.lld.tictaktoe.controller;

import org.lld.tictaktoe.models.Game;
import org.lld.tictaktoe.models.GameState;
import org.lld.tictaktoe.models.Player;
import org.lld.tictaktoe.strategies.WinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int size, List<Player> players, List<WinningStrategy> strategies) {

        /** use builder pattern to create a Game object
         * validation: only one bot
         * unique symbol and player
         *
         * make controller singleton
         */


        return new Game(size, players, strategies);
    }

    public GameState getGameState(Game game) {
        return game.getGameState();

    }

    public void display(Game game) {
        game.display();

    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public boolean makeMove(Game game) {
        return game.makeMove();
    }

    public void undo(Game game) {
        game.undo();
    }

}
