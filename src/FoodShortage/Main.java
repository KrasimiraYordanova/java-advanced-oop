package FoodShortage;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nPeople = Integer.parseInt(scanner.nextLine());

        Map<String, Buyable> persons = new HashMap<>();

        for (int i = 0; i < nPeople; i++) {

            String[] peopleInfo = scanner.nextLine().split("\\s+");
            String name = peopleInfo[0];
            int age = Integer.parseInt(peopleInfo[1]);
            Buyable person;
            if(peopleInfo.length == 4) {
                String id = peopleInfo[2];
                String dob = peopleInfo[3];
                // citizen
                person = new Citizen(name, age, id, dob);
            } else {
                String group = peopleInfo[2];
                // rebel
                person = new Rebel(name, age, group);
            }
            persons.put(name, person);
        }

        // double totalFoodQty = 0;
        String nameCommands = scanner.nextLine();
        while(!"End".equals(nameCommands)) {
            Buyable buyer = persons.get(nameCommands);
            if(buyer != null) {
                buyer.buyFood();
                // totalFoodQty += buyer.getFood();
            }
            nameCommands = scanner.nextLine();
        }
        // System.out.println(totalFoodQty);
        int totalFoodQty = persons.values()
                .stream()
                .mapToInt(Buyable::getFood)
                .sum();
        System.out.println(totalFoodQty);
    }
}

