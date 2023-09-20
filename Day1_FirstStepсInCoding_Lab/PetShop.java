package Day1_FirstStepсInCoding_Lab;//Напишете програма, която пресмята нужните разходи за закупуването на храна за кучета и котки.
// Храната се пазарува от зоомагазин, като една опаковка храна за кучета е на цена 2.50 лв, а опаковка храна за котки струва 4 лв.

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dog = Integer.parseInt(scanner.nextLine());
        int cat = Integer.parseInt(scanner.nextLine());
        double finalPrice = dog * 5.85 + cat * 8.1;
        System.out.println(finalPrice + " lv.");
    }
}