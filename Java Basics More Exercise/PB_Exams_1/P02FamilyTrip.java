package PB_Exams_1;

import java.util.Scanner;

public class P02FamilyTrip {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int restDays = Integer.parseInt(scanner.nextLine());
        double pricePerRestDay = Double.parseDouble(scanner.nextLine());
        double additionalExpenses = Double.parseDouble(scanner.nextLine());


        if (restDays > 7) {
            pricePerRestDay *= 0.95;
        }
        double total = (restDays * pricePerRestDay) + (budget * (additionalExpenses / 100));

      if (budget >= total){
          System.out.printf("Ivanovi will be left with %.2f leva after vacation." , budget - total);
      }else {
          System.out.printf("%.2f leva needed." , total - budget);
       }

    }
}
