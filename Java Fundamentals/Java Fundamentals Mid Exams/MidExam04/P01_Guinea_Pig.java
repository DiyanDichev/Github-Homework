package MidExam04;

import java.util.Scanner;

public class P01_Guinea_Pig {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double food = Double.parseDouble(scanner.nextLine());
        double hay = Double.parseDouble(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());

        for (int i = 1; i <= 30; i++) {
            if(food < 0.3 || hay < food * 0.05 || cover < weight / 3){
                System.out.println("Merry must go to the pet store!");
                return;
            }
            food -= 0.3;

            if (i % 2 == 0){
                hay -= food * 0.05;
            }
            if(i % 3 == 0) {
                cover -= weight / 3;
            }
        }

        System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", food, hay, cover);
    }
}
