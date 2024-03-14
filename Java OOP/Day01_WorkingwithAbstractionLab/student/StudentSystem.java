package Day01_WorkingwithAbstractionLab.student;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public Map<String, Student> getStudents() {
        return this.students;
    }

    public void executeCommand(String[] commandParts) {
        String commandName = commandParts[0];
        if (commandName.equals("Create")) {
            createStudent(commandParts);
        } else if (commandParts[0].equals("Show")) {
            String name = commandParts[1];
            if (students.containsKey(name)) {
                var student = students.get(name);
                String view = String.format("%s is %s years old.", student.getName(), student.getAge());

                if (student.getGrade() >= 5.00) {
                    view += " Excellent student.";
                } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                    view += " Average student.";
                } else {
                    view += " Very nice person.";
                }

                System.out.println(view);
            }
        }
    }

    private void createStudent(String[] args) {
        String name = args[1];
        int age = Integer.parseInt(args[2]);
        double grade = Double.parseDouble(args[3]);
        Student student = new Student(name, age, grade);
        students.putIfAbsent(name, student);
    }
}
