package WildFarm;

public abstract class Feline extends Mammal {
    protected Feline(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {};
}
