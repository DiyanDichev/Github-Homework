package Day17_Associative_Arrays_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01_Count_Chars_in_a_String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol : text.toCharArray()) {
            if (symbol == ' ') {
                continue;
            }
            if (!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol, 1);
            } else {
                int currentCount = symbolsCount.get(symbol);
                symbolsCount.put(symbol, currentCount + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbolsCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // symbolsCount.entrySet()  //друг вариант за принт  на кода от ред 27 до 29
        //         .forEach(entry -> System.out.println(entry.getKey() +  " -> " + entry.getValue()));

        //symbolsCount.forEach((key, value) ->System.out.println(key + " -> " + value)); //трети вид решение
    }
}
