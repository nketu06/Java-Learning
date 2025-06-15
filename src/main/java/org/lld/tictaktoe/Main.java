package org.lld.tictaktoe;

import org.lld.tictaktoe.controller.GameController;
import org.lld.tictaktoe.models.*;
import org.lld.tictaktoe.strategies.RowWinningStrategy;
import org.lld.tictaktoe.strategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

     public static void main(String[] args) {
         System.out.println("Welcome to Tic Tac Toe Game!");
         Scanner scanner = new Scanner(System.in);

         Player player1 = new Human("Player1", new Symbol('X'));
         Player player2 = new Human("Player2", new Symbol('Y'));
//         Player player2 = new Bot("Computer",PlayerType.COMPUTER ,BotDifficultyLevel.EASY);

         GameController gameController = new GameController();
         Game game = gameController.startGame(3,
                 List.of(player1,player2),
                 List.of(new RowWinningStrategy())
         );

         gameController.display(game);
         while(gameController.getGameState(game)== GameState.IN_PROGRESS) {
             boolean isValidMove = gameController.makeMove(game);
             gameController.display(game);

             // adding undo
             if(isValidMove) {
                 System.out.println("Do you want to undo the last move? (y/n)");
                 String undoInput = scanner.nextLine();
                 if (undoInput.equalsIgnoreCase("y")) {
                     gameController.undo(game);
                     gameController.display(game);
                 }

             }


         if(gameController.getGameState(game)== GameState.SUCCESS) {
         }
       }

   }
}
