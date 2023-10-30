package Day06_Arrays_Exercise;
import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] people = new int[wagons];

        for (int i = 0; i < wagons; i++){
            people[i] = Integer.parseInt(scanner.nextLine());
        }
        int sum = 0;
        for (int number : people){
            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}
