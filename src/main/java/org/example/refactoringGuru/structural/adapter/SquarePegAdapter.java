package org.example.refactoringGuru.structural.adapter;

public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return squarePeg.getWidth() * Math.sqrt(2) / 2;
    }

    @Override
    public String toString() {
        return "SquarePegAdapter{" +
                "squarePeg=" + squarePeg +
                ", radius=" + getRadius() +
                '}';
    }
}
