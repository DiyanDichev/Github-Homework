package Day6_Sets_And_Maps_Advanced_Exercise;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02_Sets_of_Elements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] length = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Set<String> set1 = new LinkedHashSet<>();
        Set<String> set2 = new LinkedHashSet<>();

        for (int i = 0; i < length[0]; i++) {
            set1.add(scanner.nextLine());
        }
        for (int i = 0; i < length[1]; i++) {
            set2.add(scanner.nextLine());
        }

        set1.retainAll(set2);
        String result = String.join(" ", set1);
        System.out.println(result);
    }
}
