package adapter.ex1;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg((6));
        System.out.println(hole.fits(roundPeg));

        SquarePeg squarePeg = new SquarePeg(4);
        SquarePegAdapter peg = new SquarePegAdapter(squarePeg);
        System.out.println(hole.fits(peg));
    }
}
