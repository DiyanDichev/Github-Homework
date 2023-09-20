package PB_More_Exams_2;

import java.util.Scanner;

public class P05MovieRatings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int movieCount = Integer.parseInt(scanner.nextLine());

        String bestMovie = "";
        String worstMovie = "";
        double highestRate = 0;
        double lowestRate = Double.MAX_VALUE;
        double averageRate = 0;


        for ( int i = 1; i <= movieCount; i++){
            String movieName = scanner.nextLine();
            double movieRating = Double.parseDouble(scanner.nextLine());
            averageRate+= movieRating;

            if (movieRating >= highestRate){
                highestRate = movieRating;
                bestMovie = movieName;
            } else if (movieRating <= lowestRate) {
                lowestRate = movieRating;
                worstMovie = movieName;
            }
        }
        System.out.printf("%s is with highest rating: %.1f\n", bestMovie, highestRate);
        System.out.printf("%s is with lowest rating: %.1f\n", worstMovie, lowestRate);
        System.out.printf("Average rating: %.1f", averageRate / movieCount);
    }
}
