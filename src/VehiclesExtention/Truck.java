package VehiclesExtention;

public class Truck extends Vehicle {

    public final static double SUMMER_ADDITIONAL_CONSUMPTION = 1.6;
    public final static double FUEL_LEAK = 0.95;
    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + SUMMER_ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    @Override
    public void fillFuel(double liters) {
        // setFuelQuantity(getFuelQuantity() + liters * FUEL_LEAK);
        super.fillFuel(liters * FUEL_LEAK);
    }
}
