package RandomArrayList;

public class Main {

    public static void main(String[] args) {
        RandomArrayList<Integer> numbers = new RandomArrayList<Integer>();

        numbers.add(13);
        numbers.add(42);
        numbers.add(69);
        numbers.add(73);

        System.out.println(numbers.getRandomElement());
    }
}
