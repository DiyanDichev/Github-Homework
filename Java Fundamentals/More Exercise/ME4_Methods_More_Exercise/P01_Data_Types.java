package ME4_Methods_More_Exercise;

import java.util.Scanner;

public class P01_Data_Types {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String input = scanner.nextLine();

        print(type, input);

    }

    public static void print(String type, String input) {
        if (type.equals("int")) {
            int number = Integer.parseInt(input);
            System.out.println(number * 2);
        } else if (type.equals("real")) {
            double number = Double.parseDouble(input);
            System.out.printf("%.2f", number * 1.5);
        } else if(type.equals("string")){
            System.out.printf("$%s$", input);
        }
    }
}


