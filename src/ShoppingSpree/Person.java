package ShoppingSpree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    String name;
    double money;
    List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if(name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) {
        if(money < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
        this.money = money;
    }

    public void buyProduct(Product product) {
        if(money < product.getCost()) {
            String message = (String.format("%s can't afford %s", name, product.getName()));
            throw new IllegalArgumentException(message);
        }
        products.add(product);
        money = money - product.getCost();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name + " - ");
        if(products.isEmpty()) {
            sb.append("Nothing bought");
        } else {
            sb.append(String.join(", ", products.stream().map(p -> p.getName()).collect(Collectors.toList())));
        }
        return sb.toString();
    }
}
