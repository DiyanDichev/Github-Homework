package Final_Exams.Retake_FinalExam01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_Ad_Astra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([#|\\|])(?<food>[a-zA-Z ]+)\\1(?<expireDate>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> foodData = new ArrayList<>();
        int totalCalories = 0;

        while (matcher.find()){
            String productName = matcher.group("food");
            String expireDate = matcher.group("expireDate");
            String calories = matcher.group("calories");
            foodData.add("Item: " + productName + ", Best before: " + expireDate + ", Nutrition: " + calories);
            int caloriesPerFood = Integer.parseInt(matcher.group("calories"));
            totalCalories += caloriesPerFood;
        }

        System.out.printf("You have food to last you for: %d days!\n",totalCalories / 2000);
        foodData.forEach(System.out::println);
    }
}
