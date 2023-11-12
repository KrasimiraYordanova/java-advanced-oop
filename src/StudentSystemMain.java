import java.util.Arrays;
import java.util.Scanner;

public class StudentSystemMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] coordinates = readInput(scanner);

        Rectangle rect = new Rectangle(coordinates[0], coordinates[1], coordinates[2], coordinates[3]);

        int pointsCount = Integer.parseInt(scanner.nextLine());

        while (pointsCount-- > 0) {
            int[] pointCoordinates = readInput(scanner);

            Point p = new Point(pointCoordinates[0], pointCoordinates[1]);

            System.out.println(rect.contains(p));
        }
    }

    private static int[] readInput(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
