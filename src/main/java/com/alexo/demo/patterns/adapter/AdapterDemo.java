package com.alexo.demo.patterns.adapter;

public class AdapterDemo {

    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if(hole.fits(rpeg)) {
            System.out.println("Round peg r5 rits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        //hole.fits(smallSqPeg); wont compile
        //hole.fits(largeSqPeg);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if(hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg small fits square peg.");
        }
        if(hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg large fits square peg.");
        }
    }
}
