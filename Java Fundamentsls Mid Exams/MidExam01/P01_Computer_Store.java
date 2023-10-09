package MidExam01;

import java.util.Scanner;

public class P01_Computer_Store {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalSum = 0;

        while (!input.equals("special") && !input.equals("regular")){
            if(input.charAt(0) == 45){
                System.out.println("Invalid price!");
            }else {
                totalSum += Double.parseDouble(input);
            }
            input = scanner.nextLine();
        }
        if(totalSum == 0){
            System.out.println("Invalid order!");
            return;
        }
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$\n", totalSum);
        System.out.printf("Taxes: %.2f$\n", totalSum * 0.2);
        System.out.println("-----------");

         if (input.equals("special")){
             System.out.printf("Total price: %.2f$\n", (totalSum * 1.2) * 0.9);
         }else {
             System.out.printf("Total price: %.2f$\n", totalSum * 1.2);
         }
    }
}
