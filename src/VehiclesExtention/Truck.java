package VehiclesExtention;

public class Truck extends Vehicle {

    public final static double AIR_CON_ADDITIONAL_CONSUMPTION = 1.6;
    public final static double FUEL_LEAK = 0.95;
    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, AIR_CON_ADDITIONAL_CONSUMPTION);
    }

    @Override
    public void fillFuel(double liters) {
        // setFuelQuantity(getFuelQuantity() + liters * FUEL_LEAK);
        super.fillFuel(liters * FUEL_LEAK);
    }
}
