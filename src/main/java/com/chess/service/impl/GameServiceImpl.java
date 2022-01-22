package com.chess.service.impl;

import com.chess.model.Board;
import com.chess.service.GameService;

public class GameServiceImpl implements GameService {

    Board board;

    public void initBoard() {
        board=new Board();
    }

    public void playGame() {

    }
}
