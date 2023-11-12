package Pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pizzaInfo = scanner.nextLine().split(" ");
        String pizzaName = pizzaInfo[1];
        int toppingsAmount = Integer.parseInt(pizzaInfo[2]);

        String[] doughInfo = scanner.nextLine().split(" ");
        String flourType = doughInfo[1];
        String backingTechnique = doughInfo[2];
        double weight = Double.parseDouble(doughInfo[3]);

        try{
            Pizza pizza = new Pizza(pizzaName, toppingsAmount);
            Dough dough = new Dough(flourType, backingTechnique, weight);
            pizza.setDough(dough);

            String commands = scanner.nextLine();
            while(!"END".equals(commands)) {
                String[] commandChunks = commands.split(" ");
                String toppingType = commandChunks[1];
                double toppingWeight = Double.parseDouble(commandChunks[2]);
                Topping topping = new Topping(toppingType, toppingWeight);
                pizza.addTopping(topping);
                commands = scanner.nextLine();
            }
            System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
        } catch(IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
