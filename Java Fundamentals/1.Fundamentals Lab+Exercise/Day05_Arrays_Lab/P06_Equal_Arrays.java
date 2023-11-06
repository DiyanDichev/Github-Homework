package Day05_Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P06_Equal_Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] firstSequence = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] secondSequence = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean idetical = true;
        int sum = 0;
        for (int i = 0; i < firstSequence.length; i++){
            sum +=firstSequence[i];
            if (firstSequence[i] !=secondSequence[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.\n", i );
                idetical = false;
                break;
            }
        }
        if(idetical){
            System.out.printf("Arrays are identical. Sum: %d\n",sum);
        }
    }
}
