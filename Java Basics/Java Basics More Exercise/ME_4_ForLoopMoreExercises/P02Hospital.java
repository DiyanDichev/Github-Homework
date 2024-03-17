package ME_4_ForLoopMoreExercises;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int doctors = 7;
        int treatedPatients = 0;
        int unTreatedPatients = 0;
        int days = 0;

        for (int i = 1 ; i <= period ; i++) {
            int patients = Integer.parseInt(scanner.nextLine());
            days += 1;

            if (days % 3 == 0 && unTreatedPatients > treatedPatients) {
                    doctors += 1;
                days = 0;
            }

            if (patients > doctors){
                unTreatedPatients += patients - doctors;
                treatedPatients += doctors;
            }else {
                treatedPatients += patients;
            }
        }
        System.out.printf("Treated patients: %d.\n" , treatedPatients);
        System.out.printf("Untreated patients: %d.\n" , unTreatedPatients);
    }
}