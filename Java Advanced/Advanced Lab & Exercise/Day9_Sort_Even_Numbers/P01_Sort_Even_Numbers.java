package Day9_Sort_Even_Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class P01_Sort_Even_Numbers {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> numbers = Arrays.stream(reader.readLine().split(",\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


         List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbers.toString().replaceAll("\\[|]", ""));

        Collections.sort(evenNumbers);
        System.out.println(evenNumbers.toString().replaceAll("\\[|]", ""));
    }
}
