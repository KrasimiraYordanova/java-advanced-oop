package WildFarm;

public abstract class Mammal extends Animal {

    protected Mammal(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    public boolean canEat(Food food) {
        return food.getClass().getSimpleName().equals("Vegetable");
    }
}
