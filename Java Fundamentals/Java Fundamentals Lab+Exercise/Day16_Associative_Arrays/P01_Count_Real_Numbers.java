package Day16_Associative_Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P01_Count_Real_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeMap<Double, Integer> numbersCount = new TreeMap<>();

        double[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        for (double num : nums){
            if(numbersCount.containsKey(num)){
                numbersCount.put(num, numbersCount.get(num) +1);
            }else {
                numbersCount.put(num, 1);
            }
        }

        for(Map.Entry<Double, Integer> kvp : numbersCount.entrySet()) {
            System.out.printf("%.0f -> %d\n", kvp.getKey(), kvp.getValue());
        }
    }
}
