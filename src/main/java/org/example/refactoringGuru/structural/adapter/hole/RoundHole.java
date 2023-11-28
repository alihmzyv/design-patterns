package org.example.refactoringGuru.structural.adapter.hole;

import org.example.refactoringGuru.structural.adapter.pegs.RoundPeg;

public class RoundHole {
    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fits(RoundPeg roundPeg) {
        System.out.println("Radius of peg " + roundPeg.getRadius());
        return this.radius >= roundPeg.getRadius();
    }

    public double getRadius() {
        return radius;
    }
}
