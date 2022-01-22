package com.chess.model;

public class Game {
    Board board;
    Player[] players;
    List<Move> gameHistory;
    GameStatus status;
    LocalDateTime startTime;
    LocalDateTime endTime;
}
