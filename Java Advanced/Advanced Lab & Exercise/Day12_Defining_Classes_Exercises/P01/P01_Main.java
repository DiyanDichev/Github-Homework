package Day12_Defining_Classes_Exercises.P01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<P01_Opinion_Poll> allPersons = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(" ");

            P01_Opinion_Poll person = new P01_Opinion_Poll(data[0], Integer.parseInt(data[1]));

            allPersons.add(person);
        }
        allPersons
                .stream()
                .filter(e -> e.age > 30)
                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(System.out::println);

    }
}