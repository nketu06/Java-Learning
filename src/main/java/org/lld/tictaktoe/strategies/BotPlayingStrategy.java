package org.lld.tictaktoe.strategies;

import org.lld.tictaktoe.models.Board;
import org.lld.tictaktoe.models.Move;
import org.lld.tictaktoe.models.Player;

public interface BotPlayingStrategy {

    Move makeMove(Board board, Player botPlayer);
}
