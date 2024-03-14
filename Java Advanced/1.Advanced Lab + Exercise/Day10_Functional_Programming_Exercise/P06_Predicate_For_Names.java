package Day10_Functional_Programming_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P06_Predicate_For_Names {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());

        Predicate<String> withLengthSmallestN = s -> s.length() <= length;

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(withLengthSmallestN)
                .forEach(System.out::println);
    }
}
