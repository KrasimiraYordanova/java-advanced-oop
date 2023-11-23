package EnterNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        while(numbers.size() < 11) {
            try {
                readNumbers(numbers, scanner.nextLine());
            } catch (InvalidNumberException ex) {
                System.out.print(ex.getMessage());
            }
        }

        System.out.println(
                numbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));
    }

    private static void readNumbers(List<Integer> numbers, String input) {

        int number = -1;

        try{
            number = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            throw new InvalidNumberException("Invalid Number", ex);
        }

        int start = numbers.isEmpty() ? 1 : numbers.get(numbers.size() - 1);
        int end = 100;

        if(number <= start || number >= end) {
            throw new InvalidNumberException(
                    String.format("Your number is not in range (%d - %d)", start, end));
        }
        numbers.add(number);

    }
}
