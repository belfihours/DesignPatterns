package structural.adapter.domain;

public class RoundHole {

    private final int radius;
    public RoundHole(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundPiece piece){
        return this.radius> piece.getRadius();
    }
}
