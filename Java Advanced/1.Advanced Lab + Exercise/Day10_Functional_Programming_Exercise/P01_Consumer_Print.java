package Day10_Functional_Programming_Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P01_Consumer_Print {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Consumer<String> print = s -> System.out.println(s);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(print);


       //String[] input = scanner.nextLine().split("\\s+");


       //for (String string : input) {
       //    print.accept(string);
       //}
    }
}
