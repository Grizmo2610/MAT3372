package builder.ex1;

public class Manual {
    protected Engine engine;
    protected int seats;
    protected String TripComputer;
    protected String GPS;

    public Manual(Engine engine, int seats, String tripComputer, String GPS) {
        this.engine = engine;
        this.seats = seats;
        TripComputer = tripComputer;
        this.GPS = GPS;
    }

    public Manual() {
    }
}
