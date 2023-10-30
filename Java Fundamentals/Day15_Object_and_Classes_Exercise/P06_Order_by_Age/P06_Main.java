package Day15_Object_and_Classes_Exercise.P06_Order_by_Age;

import java.util.*;

public class P06_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<P06_Order_by_Age> ageList = new ArrayList<>();

        while (!input.equals("End")){
            String name = input.split(" ")[0];
            String ID = input.split(" ")[1];
            double age = Integer.parseInt(input.split(" ")[2]);

            P06_Order_by_Age personalData = new P06_Order_by_Age(name, ID, age);
            ageList.add(personalData);

            input = scanner.nextLine();
        }

        Collections.sort(ageList, Comparator.comparingDouble(P06_Order_by_Age::getAge));

        for (P06_Order_by_Age age : ageList) {
            System.out.printf("%s with ID: %s is %.0f years old.\n",age.getName(), age.getID(), age.getAge());
        }
    }
}
