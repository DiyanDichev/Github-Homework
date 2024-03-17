package PB_Exams_1;

import java.util.Scanner;

public class P06TheMostPowerfulWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int bestScores = Integer.MIN_VALUE;
        String mostPowerfullWord = "";


        while (!input.equals("End of words")){
            int pointsOfWord = 0;

            boolean check = false;
            for ( int i = 0; i < input.length(); i++) {
                char firstLatter = input.charAt(i);
                pointsOfWord += firstLatter;

                boolean firstLetterCheck = firstLatter == 'a' || firstLatter == 'o' || firstLatter == 'e' || firstLatter == 'i' || firstLatter == 'u' ||
                        firstLatter == 'y' || firstLatter == 'A' || firstLatter == 'O' || firstLatter == 'E' || firstLatter == 'I' || firstLatter == 'U' || firstLatter == 'Y';

                if (i == 0 && firstLetterCheck ){
                    check = true;
                }
            }
            if (check){
                pointsOfWord *= input.length();
            }else {
                pointsOfWord /= input.length();
            }

            if (pointsOfWord > bestScores){
                bestScores = pointsOfWord;
                mostPowerfullWord = input;
            }
            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d",mostPowerfullWord, bestScores);
    }
}
