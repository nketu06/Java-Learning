package org.lld.card;

import org.lld.card.GameStrategy.RandomCardPick;
import org.lld.card.Models.Deck;
import org.lld.card.Models.Game;
import org.lld.card.Models.GameStatus;
import org.lld.card.Models.Player;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("   **** Game started ****   ");
        Deck deck = new Deck();
//        deck.shuffle();
//        deck.displayCards();
        Game game = new Game(deck, List.of(new Player("A"), new Player("B")), new RandomCardPick());

        game.DistributeDeck();

        int rounds = 1;
        while(true) {
            game.move();
            rounds--;
            if(rounds==0){
                game.setGameStatus(GameStatus.COMPLETED);
                Player winner=game.checkWinner();
                System.out.println(winner.getName()+" won the game");
                break;
            }

        }


    }
}
