package builder.ex1;

public class CarBuilder implements Builder {
    private Car car;

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int numbers) {
        car.seats = numbers;
    }

    @Override
    public void setEngine(Engine engine) {
        car.engine = engine;
    }

    @Override
    public void setTripComputer() {

    }

    @Override
    public void setGPS() {

    }
    public Car getResult(){
        return car;
    }
}
