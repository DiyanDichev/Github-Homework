package Final_Exams.Retake_FinalExam_03;

import java.util.*;

public class P03_Need_For_Speed_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> carsData = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] carsList = scanner.nextLine().split("\\|");
            String car = carsList[0];
            int odometer = Integer.parseInt(carsList[1]);
            int fuel = Integer.parseInt(carsList[2]);

            carsData.put(car, new ArrayList<>());
            carsData.get(car).add(odometer);
            carsData.get(car).add(fuel);
        }
        while (true) {
            String[] carsList = scanner.nextLine().split(" : ");
            if (carsList[0].equals("Stop")) {
                break;
            }
            String command = carsList[0];
            String car = carsList[1];
            int distance = Integer.parseInt(carsList[2]);
            switch (command) {
                case "Drive":
                    int fuel = Integer.parseInt(carsList[3]);
                    if (carsData.get(car).get(1) >= fuel) {
                        carsData.get(car).set(0, carsData.get(car).get(0) + distance);
                        carsData.get(car).set(1, carsData.get(car).get(1) - fuel);
                        System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.\n", car, distance, fuel);
                        if (carsData.get(car).get(0) >= 100000) {
                            System.out.printf("Time to sell the %s!\n", car);
                            carsData.remove(car);
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    int refuelFuel = Integer.parseInt(carsList[2]);
                    // nqma proverka ako ve4e ima 75 litra
                    boolean flag = true;
                    for (int i = 1; i <= refuelFuel; i++) {
                        if (carsData.get(car).get(1) >= 75) {
                            System.out.printf("%s refueled with %d liters\n",car , i-1);
                            flag = false;
                            break;
                        }
                            carsData.get(car).set(1, carsData.get(car).get(1) + 1);
                    }
                    if(flag) {
                        System.out.printf("%s refueled with %d liters\n", car, refuelFuel);
                    }
                    break;
                case "Revert":
                    if(carsData.get(car).get(0) - distance > 10000){
                        carsData.get(car).set(0,carsData.get(car).get(0) - distance);
                        System.out.printf("%s mileage decreased by %d kilometers\n",car , distance);
                    }else {
                        carsData.get(car).set(0, 10000);
                    }
                    break;
            }
        }
        carsData.entrySet().stream()
                .forEach(kvp -> System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.\n",
                        kvp.getKey(), kvp.getValue().get(0), kvp.getValue().get(1)));
    }
}
