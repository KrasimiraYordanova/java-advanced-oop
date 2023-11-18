package VehiclesExtention;

import java.text.DecimalFormat;

public class Vehicle {
    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;
    private double additionalAirConConsumption;

    protected Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity, double additionalAirConConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        this.additionalAirConConsumption = additionalAirConConsumption;
    }

    public void fillFuel(double liters) {
        if(liters <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");
        }
        if(fuelQuantity + liters > tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        this.fuelQuantity += liters;
    }

    public String driveWithAir_Con(double distance) {
        setFuelConsumption(getFuelConsumption() + this.additionalAirConConsumption);
        String driveResult = this.drive(distance);
        setFuelConsumption(getFuelConsumption() - this.additionalAirConConsumption);
        return driveResult;
    }

    public String drive(double distance) {
        double fuelNeeded = this.fuelConsumption * distance;
        if(fuelNeeded < this.fuelQuantity) {
            setFuelQuantity(this.fuelQuantity - fuelNeeded);
            DecimalFormat decimalFormat = new DecimalFormat("##.##");
            return String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance));
        } else {
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuelQuantity);
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }
}
