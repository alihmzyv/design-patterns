package org.example.refactoringGuru.structural.adapter;

import org.example.refactoringGuru.structural.adapter.hole.RoundHole;
import org.example.refactoringGuru.structural.adapter.pegs.RoundPeg;
import org.example.refactoringGuru.structural.adapter.pegs.SquarePeg;
import org.example.refactoringGuru.structural.adapter.pegs.SquarePegAdapter;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(10);
        assert roundHole.fits(roundPeg);
        SquarePeg squarePeg = new SquarePeg(14);
//        roundHole.fits(squarePeg); //not compiled, needs modification !
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        assert !roundHole.fits(squarePegAdapter); //compiles, square peg adapter is a round hole
    }
}
