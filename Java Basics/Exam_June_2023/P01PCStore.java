package Exam_June_2023;

import java.util.Scanner;

public class P01PCStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cpu = Double.parseDouble(scanner.nextLine());
        double gpu = Double.parseDouble(scanner.nextLine());
        double ram = Double.parseDouble(scanner.nextLine());
        int ramCount = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());


        double cpuDiscount = cpu - (cpu * discount);
        double gpuDiscount = gpu - (gpu * discount);
        double totalInBgn = (cpuDiscount + gpuDiscount + (ram * ramCount)) * 1.57;

        System.out.printf("Money needed - %.2f leva.", totalInBgn);
    }
}
