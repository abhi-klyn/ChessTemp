package model;

import java.util.Set;

public class King extends Piece{
    public King(Spot currentSpot, Color pieceColor) {
        super(currentSpot, pieceColor);
    }

    @Override
    public Set<Move> getValidMoves() {
        return null;
    }

    @Override
    public void setValidMoves(Set<Move> validMoves) {

    }
}
