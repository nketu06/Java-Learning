package org.lld.tictaktoe.models;


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
}
