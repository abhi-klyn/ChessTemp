package model;

import java.util.HashSet;
import java.util.Set;

public class Pawn extends Piece{

    public Pawn(Spot currentSpot, Color pieceColor) {
        super(currentSpot, pieceColor);
        validMoves.add(new SingleMoveDown());
    }

    @Override
    public Set<Move> getValidMoves() {
        return validMoves;
    }

    public void setNeverMovedBefore(boolean neverMovedBefore) {
        if (neverMovedBefore == false) {
            // Only for pawn, Creates a new HashSet and adds only single move up
            // -- removing DoubleMove thing from its valid moves. 
            this.validMoves = new HashSet<>();
            this.validMoves.add(new SingleMoveUp());
        }
        this.neverMovedBefore = neverMovedBefore;
    }


}
