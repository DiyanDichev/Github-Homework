package Day16_Associative_Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P04_Word_Filter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .filter(word -> word.length() % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .toArray(String[]::new);


        for ( String word : words) {
            System.out.println(word);
        }
    }
}
