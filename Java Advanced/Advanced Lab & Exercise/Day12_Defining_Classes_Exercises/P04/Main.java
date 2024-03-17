package Day12_Defining_Classes_Exercises.P04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new LinkedList<>();

        while (n-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String nameCar = tokens[0];
            int engineSpeed = Integer.parseInt(tokens[1]);
            int enginePower = Integer.parseInt(tokens[2]);
            int cargoWeight = Integer.parseInt(tokens[3]);
            String cargoType = tokens[4];
            List<Tyre> tyres = new ArrayList<>();
            for (int i = 5; i < 12; i += 2) {
                Tyre tyre = new Tyre(Double.parseDouble(tokens[i]));
                tyres.add(tyre);
            }
            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Car car = new Car(nameCar, engine, cargo, tyres);
            if (!cars.contains(car)) {
                cars.add(car);
            }
        }
        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            cars.stream().filter(e -> e.getCargo().getCargoType().equals("fragile"))
                    .filter(car -> {
                        for (int i = 0; i < car.getTyres().size(); i++) {
                            if (car.getTyres().get(i).getTirePressure() < 1) {
                                return true;
                            }
                        }
                        return false;
                    }).forEach(e -> System.out.println(e.getModel()));


        } else if (command.equals("flamable")) {

            cars.stream().filter(e -> e.getCargo().getCargoType().equals("flamable"))
                    .filter(car -> car.getEngine().getEnginePower() > 250)
                    .forEach(e -> System.out.println(e.getModel()));

        }
    }
}