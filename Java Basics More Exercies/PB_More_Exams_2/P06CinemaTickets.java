package PB_More_Exams_2;

import java.util.Scanner;

public class P06CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int student = 0;
        int standard = 0;
        int kid = 0;
        int totalTickets = 0;

        String movieName = scanner.nextLine();
        while(!movieName.equals("Finish")){
            int freeSpaces = Integer.parseInt(scanner.nextLine());

            double totalVisitors = 0.00 ;

            String visitorType = scanner.nextLine();
            while(!visitorType.equals("End")) {
                totalVisitors++;
                totalTickets++;
                switch (visitorType) {
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
                if( totalVisitors == freeSpaces){
                    break;
                }
                visitorType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.\n", movieName ,totalVisitors / freeSpaces * 100 );
            movieName = scanner.nextLine();
        }
        System.out.println("Total tickets: " + totalTickets);
        System.out.printf("%.2f%% student tickets.\n", student * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.\n", standard * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.\n", kid * 1.0 / totalTickets * 100);
    }
}
