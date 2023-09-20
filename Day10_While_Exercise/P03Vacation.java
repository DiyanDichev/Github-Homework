package Day10_While_Exercise;

import java.util.Scanner;

public class P03Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        int consecutiveSpends = 0;
        int totalDays = 0;

        while (money < vacationPrice) {

            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            totalDays++;

            switch (action) {
                case "spend":
                    money -= sum;
                    if (money < 0) {
                        money = 0;
                    }
                    consecutiveSpends++;
                    break;
                case "save":
                    money += sum;
                    consecutiveSpends = 0;
                    break;
            }

            if (consecutiveSpends == 5) {
                System.out.println("You can't save the money.");
                System.out.println(totalDays);
                return;
            }
        }
        System.out.printf("You saved the money for %d days." , totalDays);
    }
}
