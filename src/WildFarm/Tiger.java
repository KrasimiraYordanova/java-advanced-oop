package WildFarm;

public class Tiger extends Feline {
    protected Tiger(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public boolean canEat(Food food) {
        return food.getClass().getSimpleName().equals("Meat");
    }
}
