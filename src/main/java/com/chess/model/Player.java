package com.chess.model;

import java.util.List;

public class Player {
    String id;
    String name;
    Color color;
    List<Move> playerHistory;
    boolean isWon;
    List<Piece> pieces;
}
