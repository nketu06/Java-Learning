package org.lld.tictaktoe.strategies;

import org.lld.tictaktoe.models.BotDifficultyLevel;


public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        if(botDifficultyLevel == BotDifficultyLevel.EASY){
            return new EasyPlayingStrategy();
        }
        return null;

    }
}
