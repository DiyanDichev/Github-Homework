package Day6_Sets_And_Maps_Advanced_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04_Count_Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (!map.containsKey(symbol)) {
                map.put(symbol, 1);
            } else {
                map.put(symbol, map.get(symbol) + 1);
            }
        }

        map.forEach((k,v)-> System.out.printf("%s: %d time/s\n",k,v));
    }
}
