package Day10_Functional_Programming_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03_Custom_Min_Function {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Function<Integer[], Integer> findSmallestNumber =
                arr -> Arrays.stream(arr).min(Integer::compareTo).get();

        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Integer::parseInt)
                                .toArray(Integer[] ::new);

        System.out.println(findSmallestNumber.apply(numbers));
    }
}
