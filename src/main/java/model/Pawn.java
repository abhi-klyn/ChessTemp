package model;

import java.util.Set;

public class Pawn extends Piece{

    public Pawn(Spot currentSpot, Color pieceColor) {
        super(currentSpot, pieceColor);
    }

    @Override
    public Set<Move> getValidMoves() {
        return validMoves;
    }

    @Override
    public void setValidMoves(Set<Move> validMoves) {
        if (this.pieceColor == Color.WHITE){
            if (neverMovedBefore){
                validMoves.add(new DoubleMoveUp());
            }
            validMoves.add(new SingleMoveUp(this));
        }

        else{
            if (neverMovedBefore){
                validMoves.add(new DoubleMoveDown());
            }
            validMoves.add(new DoubleMoveUp());
        }

    }


}
