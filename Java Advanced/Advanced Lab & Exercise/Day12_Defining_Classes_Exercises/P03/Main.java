package Day12_Defining_Classes_Exercises.P03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> cars = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");

            String model = tokens[0];
            double fuel = Double.parseDouble(tokens[1]);
            double consumption = Double.parseDouble(tokens[2]);

            Car car = new Car(model, fuel, consumption);
            cars.put(model, car);
        }
        String line = scanner.nextLine();

        while (!line.equals("End")) {

            String[] tokens = line.split("\\s+");

            String model = tokens[1];
            int distance = Integer.parseInt(tokens[2]);

            if (!cars.get(model).drive(distance)) {
                System.out.println("Insufficient fuel for the drive");
            }


            line = scanner.nextLine();
        }
        cars.forEach((key, value) -> System.out.println(value.getInfo()));
    }
}