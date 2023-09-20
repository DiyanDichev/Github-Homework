package Day5_ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class P09FruitOrVegetable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String food = scanner.nextLine();

        switch (food) {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
