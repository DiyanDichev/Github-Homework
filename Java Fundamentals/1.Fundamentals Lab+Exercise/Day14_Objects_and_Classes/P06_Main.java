package Day14_Objects_and_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<P06_Students_Class> students = new ArrayList<>();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }

            String[] studentArgs = line.split(" ");
            String firstName = studentArgs[0];
            String lastName = studentArgs[1];
            int age = Integer.parseInt(studentArgs[2]);
            String homeTown = studentArgs[3];

            boolean exist = false;
            for (P06_Students_Class student : students) {
                if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                    student.setAge(age);
                    student.setHomeTown(homeTown);

                    exist = true;
                    break;
                }

            }

            if(!exist) {
                P06_Students_Class student = new P06_Students_Class(firstName, lastName, age, homeTown);

                students.add(student);
            }
        }

        String filterCity = scanner.nextLine();

        for (P06_Students_Class student : students) {
            if (student.getHomeTown().equals(filterCity)) {
                System.out.println(student.getDetails());
            }
        }
    }
}
