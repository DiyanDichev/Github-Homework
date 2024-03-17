package Day11_Defining_Classes_Lab.P01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        List<P01CarInfo> cars = new ArrayList<>();
        while (count-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String brand = data[0];
            String model = data[1];
            int horsePower = Integer.parseInt(data[2]);

            P01CarInfo car = new P01CarInfo();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);
            cars.add(car);

        }
        cars.forEach(c -> System.out.println(c.carInfo()));
    }
}
