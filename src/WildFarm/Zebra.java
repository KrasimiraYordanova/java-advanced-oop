package WildFarm;

public class Zebra extends Mammal{
    protected Zebra(String name, String type, Double weight, String livingRegion) {
        super(name, type, weight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zzzzebraaa!!!");
    }
}
