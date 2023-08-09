package builder.ex1;

public class CarManualBuilder implements Builder {
    protected Manual manual;
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int numbers) {
        manual.seats = numbers;
    }

    @Override
    public void setEngine(Engine engine) {
        manual.engine = engine;
    }

    @Override
    public void setTripComputer() {

    }

    @Override
    public void setGPS() {

    }
    public Manual getResult(){
        return manual;
    }
}
