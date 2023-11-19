package Day21_Regular_Expressions_Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_SoftUni_Bar_Income {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "%(?<customerName>[A-Z][a-z]+)%[^\\|$%\\.]*<(?<productName>\\w+)>[^\\|\\$%\\.]*\\|(?<quantity>[0-9]+)\\|[^\\|\\$%\\.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);


        double totalSum = 0;
        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);

            if(matcher.find()){
                String customerName = matcher.group("customerName");
                String productName = matcher.group("productName");
                int quantity = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                double totalPrice = quantity * price;
                totalSum += totalPrice;

                System.out.printf("%s: %s - %.2f%n", customerName, productName, totalPrice);
            }
            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f",totalSum);
    }
}
