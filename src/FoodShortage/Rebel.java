package FoodShortage;

public class Rebel implements Person, Buyable {
    private String name;
    private int age;
    private String group;
    private int foodQty;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public String getGroup() {
        return this.group;
    }

    @Override
    public void buyFood() {
        this.foodQty += 5;
    }

    @Override
    public int getFood() {
        return this.foodQty;
    }
}
