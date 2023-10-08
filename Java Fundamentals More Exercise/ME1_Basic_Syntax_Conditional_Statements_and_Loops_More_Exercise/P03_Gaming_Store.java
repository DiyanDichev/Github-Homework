package ME1_Basic_Syntax_Conditional_Statements_and_Loops_More_Exercise;

import java.util.Scanner;

public class P03_Gaming_Store {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());

        double totalSpend = 0;

        String input = scanner.nextLine();
        while (!input.equals("Game Time")){
            if (budget == 0) {
                System.out.println("Out of money!");
                return;
            }
                switch (input) {
                    case "OutFall 4":
                        if (budget >= 39.99) {
                            budget -= 39.99;
                            totalSpend += 39.99;
                            System.out.println("Bought OutFall 4");
                        }else {
                            System.out.println("Too Expensive");
                        }
                        break;
                    case "CS: OG":
                        if (budget >= 15.99) {
                            budget -= 15.99;
                            totalSpend += 15.99;
                            System.out.println("Bought CS: OG");
                        }else {
                            System.out.println("Too Expensive");
                        }
                        break;
                    case "Zplinter Zell":
                        if (budget >= 19.99) {
                            budget -= 19.99;
                            totalSpend += 19.99;
                            System.out.println("Bought Zplinter Zell");
                        }else {
                            System.out.println("Too Expensive");
                        }
                        break;
                    case "Honored 2":
                        if (budget >= 59.99) {
                            budget -= 59.99;
                            totalSpend += 59.99;
                            System.out.println("Bought Honored 2");
                        }else {
                            System.out.println("Too Expensive");
                        }
                        break;
                    case "RoverWatch":
                        if (budget >= 29.99) {
                            budget -= 29.99;
                            totalSpend += 29.99;
                            System.out.println("Bought RoverWatch");
                        }else {
                            System.out.println("Too Expensive");
                        }
                        break;
                    case "RoverWatch Origins Edition":
                        if (budget >= 39.99) {
                            budget -= 39.99;
                            totalSpend += 39.99;
                            System.out.println("Bought RoverWatch Origins Edition");
                        }else {
                            System.out.println("Too Expensive");
                        }
                        break;
                    default:
                        System.out.println("Not Found");
                        break;
                }

            input = scanner.nextLine();
        }
        if (budget == 0){
            System.out.println("Out of money!");
        }else {
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpend, budget);
        }
    }
}
