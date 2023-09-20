package Day8_For_Exercise;

import java.util.Scanner;

public class P07TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int groupCount =  Integer.parseInt(scanner.nextLine());

        int pike1 = 0;
        int pike2 = 0;
        int pike3 = 0;
        int pike4 = 0;
        int pike5 = 0;

        for(int i = 0; i < groupCount; i++){
            int personCount =  Integer.parseInt(scanner.nextLine());

            if (personCount <= 5){
                pike1 += personCount;
            } else if (personCount <= 12) {
                pike2 += personCount;
            } else if (personCount <= 25) {
                pike3 += personCount;
            } else if (personCount <= 40) {
                pike4 += personCount;
            }else {
                pike5 += personCount;
            }
        }

        int totalCount =pike1 + pike2 + pike3 + pike4 + pike5 ;

        System.out.printf("%.2f%%\n", pike1 * 1.0 / totalCount * 100);
        System.out.printf("%.2f%%\n", pike2 * 1.0 / totalCount * 100);
        System.out.printf("%.2f%%\n", pike3 * 1.0 / totalCount * 100);
        System.out.printf("%.2f%%\n", pike4 * 1.0 / totalCount * 100);
        System.out.printf("%.2f%%\n", pike5 * 1.0 / totalCount * 100);
    }
}
