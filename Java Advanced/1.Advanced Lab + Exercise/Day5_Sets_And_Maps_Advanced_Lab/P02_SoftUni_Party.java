package Day5_Sets_And_Maps_Advanced_Lab;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P02_SoftUni_Party {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String guests = scanner.nextLine();

        Set<String> regular = new TreeSet<>();
       // Set<String> VIP = new TreeSet<>();

        while (!"PARTY".equals(guests)) {
           //if(Character.isDigit(guests.charAt(0))){
           //    VIP.add(guests);
           //}else {
           //    regular.add(guests);
           //}
            regular.add(guests);
            guests = scanner.nextLine();
        }
        while (!"END".equals(guests)){
          //  VIP.remove(guests);
            regular.remove(guests);
            guests = scanner.nextLine();
        }
        //System.out.println(VIP.size() + regular.size());
        System.out.println(regular.size());

        //for (String vipNames : VIP) {
        //    System.out.println(vipNames);
        //}
        for (String regularNames : regular) {
            System.out.println(regularNames);
        }
    }
}
