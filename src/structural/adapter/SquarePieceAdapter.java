package structural.adapter;

import structural.adapter.domain.RoundPiece;
import structural.adapter.domain.SquarePiece;

public class SquarePieceAdapter extends RoundPiece {
    private final SquarePiece piece;

    public SquarePieceAdapter(SquarePiece piece) {
        this.piece = piece;
    }

    @Override
    public int getRadius(){
        return this.piece.getSide()/2;
    }
}
