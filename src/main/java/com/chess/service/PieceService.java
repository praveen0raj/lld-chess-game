package com.chess.service;

import com.chess.model.Box;
import com.chess.model.Piece;

public interface PieceService {
    abstract boolean canMove(Piece piece, Box destBox);
    void update(Piece piece, Box destBox);
}
