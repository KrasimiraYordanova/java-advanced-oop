package NumberInRange;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int start = range[0];
        int end = range[1];

        System.out.println("Range: [" + start + "..." + end + "]");

        String input = scanner.nextLine();

        while(!validInput(input, start, end)) {
            input = scanner.nextLine();
        }
    }

    private static boolean validInput(String input, int start, int end) {
        Optional<Integer> number = Optional.empty();

        try {
            number = Optional.of(Integer.parseInt(input));
        } catch (NumberFormatException ignored){
        }

        boolean isValid =  number.isPresent() && number.get() >= start && number.get() <= end;

        String output = isValid
                ? String.format("Valid number: %d", number.get())
                : String.format("Invalid number: %s", input);

        System.out.println(output);
        return isValid;
    }
}