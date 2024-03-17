package Day10_Functional_Programming_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P02_Knights_of_Honor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> print = s -> System.out.println("Sir " + s);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(print);
    }
}
