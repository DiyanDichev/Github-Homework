package Day15_Object_and_Classes_Exercise.P04_Students;

import java.util.*;

public class P04_Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i < countStudents; i++) {
            String studentInfo = scanner.nextLine();
            String firstName = studentInfo.split(" ")[0];
            String lastName = studentInfo.split(" ")[1];
            double grade = Double.parseDouble(studentInfo.split(" ")[2]);

            Student student = new Student(firstName,lastName,grade);
            studentList.add(student);

        }
        Collections.sort(studentList, Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student student : studentList) {
            System.out.printf("%s %s: %.2f\n",student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
