package Day09_List_Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_Sum_Adjacent_Equal_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        List<Double> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentElement = numbers.get(i);
            double rightElement = numbers.get(i + 1);
            if(currentElement == rightElement){
                double newElement = currentElement + rightElement;
                numbers.remove(i + 1);
                numbers.set(i, newElement);
                i = -1;
            }
        }
        for (double num : numbers) {
            System.out.print(new DecimalFormat("0.###").format(num) + " ");
        }
    }
}
