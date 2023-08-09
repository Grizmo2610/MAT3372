package adapter.ex1;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        super(0);
        this.peg = peg;
    }

    public int getRadius() {
        peg.setWidth(2);
        super.setRadius(peg.getWidth() * (int) Math.sqrt(2) / 2);
        return peg.getWidth() * (int) Math.sqrt(2) / 2;
    }
}
