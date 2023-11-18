package VehiclesExtention;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");
        double carFuelQuantity = Double.parseDouble(line[1]);
        double carFuelConsumption = Double.parseDouble(line[2]);
        double carTankCapacity = Double.parseDouble(line[3]);
        Vehicle car = new Car(carFuelQuantity, carFuelConsumption, carTankCapacity);

        String[] line2 = scanner.nextLine().split("\\s+");
        double truckFuelQuantity = Double.parseDouble(line2[1]);
        double truckFuelConsumption = Double.parseDouble(line2[2]);
        double truckTankCapacity = Double.parseDouble(line[3]);
        Vehicle truck = new Truck(truckFuelQuantity, truckFuelConsumption, truckTankCapacity);

        String[] line3 = scanner.nextLine().split("\\s+");
        double busFuelQuantity = Double.parseDouble(line3[1]);
        double busFuelConsumption = Double.parseDouble(line3[2]);
        double busTankCapacity = Double.parseDouble(line3[3]);
        Vehicle bus = new Bus(busFuelQuantity, busFuelConsumption, busTankCapacity);

        int commandsCount = Integer.parseInt(scanner.nextLine());

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        for (int i = 0; i < commandsCount; i++) {
            String[] command = scanner.nextLine().split("\\s+");

            String action = command[0];
            String vehicleType = command[1];
            double distance = Double.parseDouble(command[2]);

            if(action.equals("Drive")) {
                vehicles.get(vehicleType).driveWithAir_Con(distance);
            }if(action.equals("DriveEmpty")) {
                vehicles.get(vehicleType).drive(distance);
            }else {
                try{
                    vehicles.get(vehicleType).fillFuel(distance);
                } catch(IllegalArgumentException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
        vehicles.values().forEach(System.out::println);
    }
}
