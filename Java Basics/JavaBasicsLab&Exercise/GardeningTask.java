import java.util.Scanner;

public class GardeningTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double size = Double.parseDouble(scanner.nextLine());

        double priceWithoutDiscount = size * 7.61;
        double discount = 0.18 * priceWithoutDiscount;
        double priceWithDiscount = priceWithoutDiscount - discount;
        System.out.printf("The Final Price is: %.2f lv.%n", priceWithDiscount);
        System.out.printf("The Discount is: %.2f lv.",discount);

    }
}
