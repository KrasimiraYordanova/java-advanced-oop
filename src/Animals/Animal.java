package Animals;

public class Animal {
    private String name;
    private String favoriteFood;

    protected Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
    }

    public String explainSelf() {
        return String.format("I am %s and my favorite food is %s", this.name, this.favoriteFood);
    };
}
