package Day07_Methods_Lab;

import java.util.Scanner;

public class P09_Greater_of_Two_Values {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        if (type.equals("int")) {
            int firstNumber = Integer.parseInt(scanner.nextLine());
            int secondNumber = Integer.parseInt(scanner.nextLine());

            System.out.println(getMax(firstNumber, secondNumber));
        } else if (type.equals("char")) {
            char firstLetter = scanner.nextLine().charAt(0);
            char secondLetter = scanner.nextLine().charAt(0);

            System.out.println(getMax(firstLetter, secondLetter));
        } else {
            String firstString = scanner.nextLine();
            String secondString = scanner.nextLine();

            System.out.println(getMax(firstString, secondString));
        }
    }
        public static int getMax ( int a, int b){
            if (a > b) {
                return a;
            }
            return b;
        }
        public static char getMax(char firstLetter, char secondLetter){
            if(firstLetter > secondLetter){
                return firstLetter;
            }
            return secondLetter;
        }
        public static String getMax (String firstString , String secondString){
            if (firstString.compareTo(secondString) >= 0){
                return  firstString;
        }
            return secondString;
    }
}
