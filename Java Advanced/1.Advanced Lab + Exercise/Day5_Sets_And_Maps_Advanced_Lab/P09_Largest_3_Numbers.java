package Day5_Sets_And_Maps_Advanced_Lab;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09_Largest_3_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        for (int i = 0; i < numbers.size() && i < 3; i++) {
            System.out.printf("%d ", numbers.get(i));
        }
    }
}