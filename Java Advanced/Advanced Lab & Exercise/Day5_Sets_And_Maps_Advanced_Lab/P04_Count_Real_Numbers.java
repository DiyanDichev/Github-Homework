package Day5_Sets_And_Maps_Advanced_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P04_Count_Real_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        Map<Double, Integer> numbers = new LinkedHashMap<>();

        for (Double num : input) {
            numbers.putIfAbsent(num,0);
            int newCount = numbers.get(num) + 1;
            numbers.put(num,newCount);
        }

        numbers.forEach((k,v) ->{
            System.out.printf("%.1f -> %d\n",k,v);
        });
    }
}
