package org.lld.card.Models;

import org.lld.card.GameStrategy.CardPick;

import java.util.List;

public class Game {
    Deck deck;
    List<Player> players;
    int turn;
    CardPick cardPick;

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    GameStatus gameStatus;


    public Game (Deck deck, List<Player> players, CardPick cardPick) {
        this.deck = deck;
        this.players = players;
        this.turn = 0;
        this.cardPick = cardPick;
        gameStatus = GameStatus.NOT_STARTED;
    }

    public void DistributeDeck(){

        gameStatus=GameStatus.INPROGRESS;

        if(players.size()==1){
            System.out.println(players.getFirst().getName()+" is winner");
            gameStatus = GameStatus.COMPLETED;
        }
        if((players.size() > 1) &&
                (deck.getCards().size()%players.size()==0)){
            deck.shuffle();
//            deck.displayCards();

            for(Card card : deck.getCards()){
                players.get(turn).addCard(card);
                turn++;
                turn %= players.size();
            }
        }
        else{
            throw new RuntimeException("Equal distribution Not possible");
        }
    }

    public Player checkWinner(){
        int highestScore=0;
        Player winner=players.get(0);
        for(Player player : players){
            if(player.getScore()>highestScore){
                highestScore=player.getScore();
                winner=player;
            }
        }
        return winner;
    }

    public void move(){
        for(Player player : players){
            Card card = cardPick.selectCard(player);
            System.out.println(player.getName()+" picked card: "+card);
           player.setScore( player.getScore()+card.rank.getValue());
            System.out.println(player.getName()+" player scored: "+player.getScore());
        }
    }






}
