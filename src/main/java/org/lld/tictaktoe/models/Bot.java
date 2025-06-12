package org.lld.tictaktoe.models;


import org.lld.tictaktoe.strategies.BotPlayingStrategy;
import org.lld.tictaktoe.strategies.BotPlayingStrategyFactory;

public class Bot extends Player {
    private BotDifficultyLevel difficultyLevel;

    public Bot(String name, PlayerType playerType, BotDifficultyLevel difficultyLevel) {
        super(name, new Symbol('B'), PlayerType.COMPUTER);
        this.difficultyLevel = difficultyLevel;
    }

    public BotDifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public Move makeMove(Board board) {

        return BotPlayingStrategyFactory.getBotPlayingStrategy(difficultyLevel)
                .makeMove(board, this);

    }
}
