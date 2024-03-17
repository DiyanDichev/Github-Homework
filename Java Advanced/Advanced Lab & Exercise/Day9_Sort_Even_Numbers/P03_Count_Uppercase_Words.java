package Day9_Sort_Even_Numbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P03_Count_Uppercase_Words {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Predicate<String> isUpperCase = s -> Character.isUpperCase(s.charAt(0));
        Consumer<String> printConsole = s -> System.out.println(s);
        List<String> result =  Arrays.stream(reader.readLine().split("\\s+"))
                .filter(isUpperCase)
                .collect(Collectors.toList());

        printConsole.accept(String.valueOf(result.size()));
        result.forEach(printConsole);

    }
}
