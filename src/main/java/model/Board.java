package model;

import java.util.List;

public class Board {

    int boardSize;
    Spot[][] boardSpots;

    public Board(int boardSize) {
        this.boardSize = boardSize;
        this.boardSpots = new Spot[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize; j++) {
                boardSpots[i][j] = new Spot(i, j);
            }
        }
        boardSpots[1][1].occupyingPiece = new Pawn(boardSpots[1][1], Color.WHITE);
    }

    public boolean action(int x1, int y1, int x2, int y2) {
        Piece piece = boardSpots[x1][y1].occupyingPiece;
        for(Move move: piece.getValidMoves()) {
            if (move.isValid(x1, y1, x2, y2)) {
                boardSpots[x2][y2].occupyingPiece = boardSpots[x1][y1].occupyingPiece;
                boardSpots[x1][y1].occupyingPiece = null;
                piece.setNeverMovedBefore(false);
                return true;
            }
        }
        return false;
    }
}
