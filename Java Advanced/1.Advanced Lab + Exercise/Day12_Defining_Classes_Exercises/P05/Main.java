package Day12_Defining_Classes_Exercises.P05;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Engine engine = null;
        List<Engine> engines = new LinkedList<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            switch (tokens.length) {
                case 2:
                    engine = new Engine(tokens[0], tokens[1]);
                    break;
                case 3:
                    if (isNum(tokens[2])) {
                        engine = new Engine(tokens[0], tokens[1], tokens[2], "n/a");
                    } else {
                        engine = new Engine(tokens[0], tokens[1], "n/a", tokens[2]);
                    }

                    break;
                default:
                    engine = new Engine(tokens[0], tokens[1], String.valueOf(tokens[2]), tokens[3]);
            }
            engines.add(engine);
        }
        n = Integer.parseInt(scanner.nextLine());
        Car car = null;
        List<Car> cars = new LinkedList<>();
        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            Engine currentEngine = null;
            for (Engine engine1 : engines) {
                if (engine1.getModel().equals(tokens[1])) {
                    currentEngine = engine1;
                    break;
                }
            }
            switch (tokens.length) {
                case 2:
                    car = new Car(tokens[0], currentEngine);
                    break;
                case 3:
                    if (isNum(tokens[2])) {
                        car = new Car(tokens[0], currentEngine, tokens[2], "n/a");
                    } else {
                        car = new Car(tokens[0], currentEngine, "n/a", tokens[2]);
                    }

                    break;
                default:
                    car = new Car(tokens[0], currentEngine, String.valueOf(tokens[2]), tokens[3]);
            }
            cars.add(car);
        }
        cars.forEach(System.out::println);
    }

    private static boolean isNum(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}