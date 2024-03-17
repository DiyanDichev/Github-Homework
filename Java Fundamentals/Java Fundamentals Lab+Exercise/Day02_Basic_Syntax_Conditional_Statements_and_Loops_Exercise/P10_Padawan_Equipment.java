package Day02_Basic_Syntax_Conditional_Statements_and_Loops_Exercise;

import java.util.Scanner;

public class P10_Padawan_Equipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int studentsCount = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice =  Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double studentsCountExtra = Math.ceil(studentsCount * 1.1) ;
        double lightSaberExtraPrice = studentsCountExtra * lightSaberPrice;
        double beltExtraPrice = (studentsCount - studentsCount / 6) * beltPrice;

        double totalPrice = lightSaberExtraPrice + beltExtraPrice + (studentsCount * robePrice);

        if(budget >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.",totalPrice);
        }else {
            System.out.printf("George Lucas will need %.2flv more.",totalPrice - budget);
        }
    }
}
