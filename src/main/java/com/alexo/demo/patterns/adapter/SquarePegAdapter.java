package com.alexo.demo.patterns.adapter;

/**
 * this adapter class lets you fit square pegs into round holes
 * this adapter extends the RoundPeg class to let the adapter objects
 * act as round pegs.
 */
public class SquarePegAdapter extends RoundPeg {
    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double result;
        result = (Math.sqrt(Math.pow((squarePeg.getWidth()/2), 2) * 2));
        return result;
    }
}
