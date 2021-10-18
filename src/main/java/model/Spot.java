package model;

public class Spot {
    int x;
    int y;
    Piece occupyingPiece;

    public Spot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean isFree(){
        return occupyingPiece == null;
    }
}
