import java.util.Scanner;

public class RhombusOfStars {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        printRhombus(size);
    }

    public static void printRhombus(int size) {
        for (int i = 1; i <= size; i++) {
            printRhombusLine(size, i);
        }

        for (int i =  size - 1; i >= 1; i--) {
            printRhombusLine(size, i);
        }
    }

    public static void printRhombusLine(int rows, int currentRow) {
        for (int i = 0; i < rows - currentRow; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < currentRow; i++) {
            System.out.print("* ");
        }

        System.out.println();
    }
}
