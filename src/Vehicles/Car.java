package Vehicles;

public class Car extends Vehicle {

    public final static double SUMMER_ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption + SUMMER_ADDITIONAL_CONSUMPTION);
    }

}
