package com.chess.service;

import com.chess.model.Color;
import com.chess.model.Piece;
import com.chess.model.Player;

public interface PlayerService {
    Player createPlayer(String name, Color color);
    Player getPlayer(String playerId);
    boolean hasPiece(Player player, Piece piece);
}
