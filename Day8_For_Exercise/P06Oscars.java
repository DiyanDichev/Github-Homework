package Day8_For_Exercise;

import java.util.Scanner;

public class P06Oscars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double points =  Double.parseDouble(scanner.nextLine());
        int judgesCount =  Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < judgesCount; i++) {

            String judgeName = scanner.nextLine();
            double judgePoints =  Double.parseDouble(scanner.nextLine());

            points += judgeName.length() * judgePoints / 2;
            if(points > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!" , actorName , points);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!" , actorName , 1250.5 - points);
    }
}
