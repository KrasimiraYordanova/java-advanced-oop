package VehiclesExtention;

public class Car extends Vehicle {

    public final static double SUMMER_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + SUMMER_ADDITIONAL_CONSUMPTION, tankCapacity);
    }
}
