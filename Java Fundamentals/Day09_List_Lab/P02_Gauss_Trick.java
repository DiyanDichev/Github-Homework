package Day09_List_Lab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_Gauss_Trick {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        if(nums.size() % 2 != 0){
            int midIdx = nums.size() / 2;
            nums.add(midIdx, 0);
        }

        for (int i = 0; i < nums.size() / 2; i++) {
            int leftElement = nums.get(i);
            int rightElement = nums.get(nums.size() - i - 1);
            result.add(leftElement + rightElement);
        }
        System.out.println(String.join(" ",
                result.stream().map(String::valueOf).toArray(String[]::new)));
    }
}
