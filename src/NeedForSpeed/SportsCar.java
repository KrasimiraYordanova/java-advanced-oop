package NeedForSpeed;

public class SportsCar extends Car {
    public final static double DEFAULT_FUEL_CONSUMPTION = 10;
    public SportsCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
