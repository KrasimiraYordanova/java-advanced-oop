package WildFarm;

import java.text.DecimalFormat;

public abstract class Animal {

    private String name;
    private String type;
    private Double weight;
    private Integer quantityEaten;
    private String livingRegion;

    protected Animal(String name, String type, Double weight, String livingRegion) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.quantityEaten = 0;
        this.livingRegion = livingRegion;
    }

    public abstract void makeSound();

    public abstract boolean canEat(Food food);

    public void eat(Food food) {
        if(canEat(food)) {
            this.quantityEaten += food.getQuantity();
        } else {
            System.out.println(getClass().getSimpleName() + "s are not eating that type of food!");
        }
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s[%s, %s, %s, %d]",
                getClass().getSimpleName(),
                name,
                decimalFormat.format(weight),
                livingRegion,
                quantityEaten);
    }
}
