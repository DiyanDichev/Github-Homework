package Day12_Nested_Loops_Exercise;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int student = 0;
        int standard = 0;
        int kid = 0;
        int total = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")){
            int places = Integer.parseInt(scanner.nextLine());

            int freePlaces = 0;

            String input1 = scanner.nextLine();
            while (!input1.equals("End")) {
                freePlaces++;
                total++;
                    switch (input1) {
                        case "student":
                            student++;
                            break;
                        case "standard":
                            standard++;
                            break;
                        case "kid":
                            kid++;
                            break;
                    }
                if (freePlaces == places){
                    break;
                }
                input1 = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", input, freePlaces * 1.0 / places * 100);
            input = scanner.nextLine();
        }
        System.out.println("Total tickets: " + total);
        System.out.printf("%.2f%% student tickets.\n", student * 1.0 / total * 100);
        System.out.printf("%.2f%% standard tickets.\n", standard * 1.0 / total * 100);
        System.out.printf("%.2f%% kids tickets.\n", kid * 1.0 / total * 100);
    }
}
