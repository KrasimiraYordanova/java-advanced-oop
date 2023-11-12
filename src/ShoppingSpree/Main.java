package ShoppingSpree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(";");

        Map<String, Person> people = new LinkedHashMap<>();

        for(String token : tokens) {
            String[] personData = token.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);

            try {
                Person person = new Person(name, money);
                people.put(name, person);
            } catch(IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }
        String[] products = scanner.nextLine().split(";");
        Map<String, Product> productsMap = new LinkedHashMap<>();

        for(String productInfo : products) {
            String[] productData = productInfo.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);

            try{
                Product newProduct = new Product(name, cost);
                productsMap.put(name, newProduct);
            } catch(IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
                return;
            }
        }

        String command = scanner.nextLine();
        while(!"END".equals(command)) {
            String[] commandParts = command.split(" ");
            String personName = commandParts[0];
            String productName = commandParts[1];

            Person buyer = people.get(personName);
            Product product = productsMap.get(productName);
            try {
                buyer.buyProduct(product);
                System.out.printf("%s bought %s", buyer.getName(), product.getName());
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
            command = scanner.nextLine();
        }

        people.values().forEach(System.out::println);
    }
}
