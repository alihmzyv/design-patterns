package org.example.refactoringGuru.structural.adapter.pegs;

public class RoundPeg {
    private final double radius;

    protected RoundPeg() {
        this.radius = 0;
    }

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
