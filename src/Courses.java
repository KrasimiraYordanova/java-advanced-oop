public enum Courses {

    Basics("Basics", 0, "first course"),
    Fundamentals("Fundamentals", 0, "second course"),
    Advanced("Advanced", 0, "third course");

    private String name;
    private int price;
    private String description;

    Courses(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return  description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return String.format("The name of the course is %s and it cost %d", name, price);
    }
}
