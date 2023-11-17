package Vehicles;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        double carFuelQuantity = Double.parseDouble(line[1]);
        double carFuelConsumption = Double.parseDouble(line[2]);
        Vehicle car = new Car(carFuelQuantity, carFuelConsumption);

        String[] line2 = scanner.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(line2[1]);
        double truckFuelConsumption = Double.parseDouble(line2[2]);
        Vehicle truck = new Truck(truckFuelQuantity, truckFuelConsumption);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);

        for (int i = 0; i < commandsCount; i++) {
            String[] command = scanner.nextLine().split("\\s+");

            String action = command[0];
            String vehicleType = command[1];
            double distance = Double.parseDouble(command[2]);

            if(action.equals("Drive")) {
                vehicles.get(vehicleType).drive(distance);
            } else {
                vehicles.get(vehicleType).fillFuel(distance);
            }
        }
        vehicles.values().forEach(System.out::println);
    }
}
