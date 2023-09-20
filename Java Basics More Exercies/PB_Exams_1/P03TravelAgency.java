package PB_Exams_1;

import java.util.Scanner;

public class P03TravelAgency {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String additional = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        if (vip.equals("yes") || vip.equals("no")) {

            if (days < 1) {
                System.out.print("Days must be positive number!");
                return;
            }

            if (days > 7) {
                days--;
            }

            double price;

            if (vip.equals("yes")) {
                switch (destination) {
                    case "Bansko":
                    case "Borovets":
                        if (additional.equals("noEquipment")) {
                            price = (80.0 * days) * 0.95;
                            // ne sam siguren dali da e else ili else if
                        } else if (additional.equals("withEquipment")){
                            price = (100.0 * days) * 0.9;
                        }else {
                            System.out.print("Invalid input!");
                            return;
                        }
                        break;
                    case "Varna":
                    case "Burgas":
                        if (additional.equals("noBreakfast")) {
                            price = (100 * days) * 0.93;
                        } else if (additional.equals("withBreakfast")){
                            price = (130 * days) * 0.88;
                        }else {
                            System.out.print("Invalid input!");
                            return;
                        }
                        break;
                    default:
                        System.out.print("Invalid input!");
                        return;
                }
            } else {
                switch (destination) {
                    case "Bansko":
                    case "Borovets":
                        if (additional.equals("noEquipment")) {
                            price = 80.0 * days;
                            // ne sam siguren dali da e else ili else if
                        } else if (additional.equals("withEquipment")){
                            price = 100.0 * days;
                        }else {
                        System.out.print("Invalid input!");
                        return;
                    }
                        break;
                    case "Varna":
                    case "Burgas":
                        if (additional.equals("noBreakfast")) {
                            price = 100 * days;
                        } else if (additional.equals("withBreakfast")){
                            price = 130 * days;
                        }else {
                        System.out.print("Invalid input!");
                        return;
                    }
                        break;
                    default:
                        System.out.print("Invalid input!");
                        return;
                }
            }
            System.out.printf("The price is %.2flv! Have a nice time!", price);
        }else {
            System.out.print("Invalid input!");
        }
    }
}
