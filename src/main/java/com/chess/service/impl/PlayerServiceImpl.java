package com.chess.service.impl;

import com.chess.model.Color;
import com.chess.model.Piece;
import com.chess.model.Player;
import com.chess.service.PlayerService;

import java.util.HashMap;
import java.util.Map;

public class PlayerServiceImpl implements PlayerService {

    Map<String,Player> players =  new HashMap<>();

    public Player createPlayer(String name, Color color) {
        return null;
    }

    public Player getPlayer(String playerId) {
        return null;
    }

    public boolean hasPiece(Player player, Piece piece) {
        return false;
    }
}
