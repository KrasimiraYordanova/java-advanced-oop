package VehiclesExtention;

public class Bus extends Vehicle{

    public final static double AIR_CON_ADDITIONAL_CONSUMPTION = 1.4;
    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity, AIR_CON_ADDITIONAL_CONSUMPTION);
    }
}
