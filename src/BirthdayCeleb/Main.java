package BirthdayCeleb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Birthable> birthables = new ArrayList<>();

        while(!"End".equals(input)) {
            String[] tokens = input.split("\\s+");
            String objectType = tokens[0];
            String name = tokens[1];
            if(tokens.length > 3) {
                int age = Integer.parseInt(tokens[2]);
                String id = tokens[3];
                String dob = tokens[4];
                Citizen citizen = new Citizen(name, age, id, dob);
                birthables.add(citizen);
            } else {
                String dob_Id = tokens[2];
                if ("Pet".equals(objectType)) {
                    Pet pet = new Pet(name, dob_Id);
                    birthables.add(pet);
                } else {
                    Robot robot = new Robot(name, dob_Id);
                    // birthables.add(robot);
                }
            }

            input = scanner.nextLine();
        }
        String year = scanner.nextLine();

        boolean isFound = false;
        for (Birthable birthable : birthables) {
            if(birthable.getBirthDate().endsWith(year)) {
                isFound = true;
                System.out.println(birthable.getBirthDate());
            }
        }
        if(!isFound) {
            System.out.print("<no output>");
        }

        }
    }

