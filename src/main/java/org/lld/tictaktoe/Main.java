package org.lld.tictaktoe;

import org.lld.tictaktoe.controller.GameController;
import org.lld.tictaktoe.models.*;
import org.lld.tictaktoe.strategies.RowWinningStrategy;
import org.lld.tictaktoe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

class Main {

     public static void main(String[] args) {
         System.out.println("Welcome to Tic Tac Toe Game!");

         Player player1 = new Human("Player1", new Symbol('X'));
         Player player2 = new Human("Player2", new Symbol('Y'));

         GameController gameController = new GameController();
         Game game = gameController.startGame(3,
                 List.of(player1,player2),
                 List.of(new RowWinningStrategy())
         );

         gameController.display(game);
         System.out.println(gameController.getGameState(game).toString());
         while(gameController.getGameState(game)== GameState.IN_PROGRESS) {
             gameController.makeMove(game);
             gameController.display(game);

         }

         if(gameController.getGameState(game)== GameState.SUCCESS) {
         }
     }

}
