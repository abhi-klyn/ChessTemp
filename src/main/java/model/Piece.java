package model;

import java.util.HashSet;
import java.util.Set;

public abstract class Piece {

    boolean isAlive = true;
    Set<Move> validMoves;
    Spot currentSpot;
    Color pieceColor;
    boolean neverMovedBefore = true;

    public Piece(Spot currentSpot, Color pieceColor) {
        this.currentSpot = currentSpot;
        this.pieceColor = pieceColor;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public abstract Set<Move> getValidMoves();

    public abstract void setValidMoves(Set<Move> validMoves);

    public Spot getCurrentSpot() {
        return currentSpot;
    }

    public void setCurrentSpot(Spot currentSpot) {
        this.currentSpot = currentSpot;
    }

    public Color getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(Color pieceColor) {
        this.pieceColor = pieceColor;
    }

    public boolean isNeverMovedBefore() {
        return neverMovedBefore;
    }

    public void setNeverMovedBefore(boolean neverMovedBefore) {
        this.neverMovedBefore = neverMovedBefore;
    }
}
