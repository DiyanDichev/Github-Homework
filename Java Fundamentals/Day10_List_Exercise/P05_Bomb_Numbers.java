package Day10_List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_Bomb_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> sequence = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String specialNumAndPower = scanner.nextLine();
        int specialNum = Integer.parseInt(String.valueOf(specialNumAndPower.split(" ")[0]));
        int numberPower = Integer.parseInt(String.valueOf(specialNumAndPower.split(" ")[1]));
        int specialNumIndex = 0;
        for (int i = 0; i < sequence.size(); i++) {



            if (sequence.get(i) == specialNum) {
                specialNumIndex = i;
                int leftNumberPower = numberPower;
                int rightNumberPower = numberPower;
                for (int j = 0; j < leftNumberPower; j++) {
                    int previousNumberIndex = specialNumIndex - 1;
                    if (previousNumberIndex < 0) {
                        break;
                    }
                    sequence.remove(previousNumberIndex);
                    specialNumIndex--;
                    j--;
                    leftNumberPower--;

                }
                for (int j = 0; j < rightNumberPower; j++) {
                    int nextNumberIndex = specialNumIndex + (j + 1);
                    if (nextNumberIndex > sequence.size() - 1) {
                        break;
                    }
                    sequence.remove(nextNumberIndex);
                    j--;
                    rightNumberPower--;
                }
                sequence.remove(specialNumIndex);
            }
        }
         sequence.remove(Integer.valueOf(specialNum));
        int sequenceSum = 0;
        for (int i = 0; i < sequence.size(); i++) {
            sequenceSum += sequence.get(i);
        }
        System.out.println(sequenceSum);
    }
}
