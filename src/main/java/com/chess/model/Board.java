package com.chess.model;

public class Board {
    Box[][] boxes;

    public Board(){
        boxes=new Box[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                boxes[i][j].isEmpty=false;
            }
        }
        for(int i=0;i<8;i++){
        }
    }
}
