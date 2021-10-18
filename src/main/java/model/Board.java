package model;

import java.util.List;

public class Board {

    int boardSize;
    Spot[][] boardSpots;

    public Board(int boardSize) {
        this.boardSize = boardSize;
        this.boardSpots = new Spot[boardSize][boardSize];
    }
}
