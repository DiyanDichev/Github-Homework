package MidExam02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double averageNumber = numbers.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);

        List<Integer> topNumbers = numbers.stream()
                .filter(num -> num > averageNumber)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        if (topNumbers.isEmpty()) {
            System.out.println("No");
        } else {
            for (int i = 0; i < Math.min(5, topNumbers.size()); i++) {
                System.out.print(topNumbers.get(i) + " ");
            }
        }
    }
}