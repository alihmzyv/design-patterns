package org.example.refactoringGuru.structural.adapter;

public class SquarePeg {
    private final double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "SquarePeg{" +
                "width=" + width +
                '}';
    }
}
