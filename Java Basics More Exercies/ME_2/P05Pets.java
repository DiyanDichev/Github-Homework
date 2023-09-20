package ME_2;

import java.util.Scanner;

public class P05Pets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int daysAway =  Integer.parseInt(scanner.nextLine());
        int totalFood =  Integer.parseInt(scanner.nextLine());
        double dogFood =  Double.parseDouble(scanner.nextLine());
        double catFood =  Double.parseDouble(scanner.nextLine());
        double turtleFood =  Double.parseDouble(scanner.nextLine());

        double foodInGramsPerDay = (dogFood * 1000) + (catFood * 1000) + turtleFood;
        double food = daysAway * foodInGramsPerDay / 1000;

      if (food <= totalFood) {
          System.out.printf("%.0f kilos of food left." , Math.floor(totalFood - food));
      }else {
          System.out.printf("%.0f more kilos of food are needed." , Math.ceil(food - totalFood));
      }
    }
}
