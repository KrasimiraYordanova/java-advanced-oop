package VehiclesExtention;

public class Car extends Vehicle {

    public final static double AIR_CON_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, AIR_CON_ADDITIONAL_CONSUMPTION);
    }
}
