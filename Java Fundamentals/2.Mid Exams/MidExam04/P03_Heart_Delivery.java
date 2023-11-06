package MidExam04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_Heart_Delivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split("@"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int cupidStartIndex = 0;
        int successCounter = 0;
        String operator = scanner.nextLine();
        while (!operator.equals("Love!")) {

            cupidStartIndex += Integer.parseInt(operator.split(" ")[1]);

            if (cupidStartIndex > input.size() - 1) {
                cupidStartIndex = 0;
                if (input.get(0) == 0) {
                    System.out.println("Place 0 already had Valentine's day.");
                } else {
                    input.set(0, input.get(0) - 2);
                    if (input.get(0) == 0) {
                        System.out.printf("Place %d has Valentine's day.\n", cupidStartIndex);
                        successCounter++;
                    }
                }
            } else {
                if (input.get(cupidStartIndex) == 0) {
                    System.out.printf("Place %d already had Valentine's day.\n", cupidStartIndex);
                } else {
                    input.set(cupidStartIndex, input.get(cupidStartIndex) - 2);
                    if (input.get(cupidStartIndex) == 0) {
                        System.out.printf("Place %d has Valentine's day.\n", cupidStartIndex);
                        successCounter++;
                    }
                }
            }

            operator = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.\n", cupidStartIndex);
        if (input.size() == successCounter) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", input.size() - successCounter);
        }
    }
}
