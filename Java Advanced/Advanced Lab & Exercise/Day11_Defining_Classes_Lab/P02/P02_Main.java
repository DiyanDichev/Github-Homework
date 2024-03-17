package Day11_Defining_Classes_Lab.P02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        List<P02_Constructors> cars = new ArrayList<>();
        while (count-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            P02_Constructors car = null;
            if (data.length == 1) {
                car = new P02_Constructors(data[0]);
            }else {
                String brand = data[0];
                String model = data[1];
                int horsePower = Integer.parseInt(data[2]);
                car = new P02_Constructors(brand,model, horsePower);
            }
            cars.add(car);

        }
        cars.forEach(c -> System.out.println(c.carInfo()));
    }
}
