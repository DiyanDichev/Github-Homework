package Day10_Functional_Programming_Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05_Reverse_And_Exclude {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> isNotDivisibleByN = number -> number % n != 0;

        Collections.reverse(numbers);

        numbers.stream()
                .filter(isNotDivisibleByN)
                .forEach(num -> System.out.print(num + " "));
    }
}
