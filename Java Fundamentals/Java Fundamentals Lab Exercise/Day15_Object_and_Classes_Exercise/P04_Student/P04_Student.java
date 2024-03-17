package Day15_Object_and_Classes_Exercise.P04_Students;

public class Student {

    private String firstName;
    private String lastName;
    private double grade;

    public Student(String firstName, String lastName, double grade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getGrade() {
        return this.grade;
    }
}
