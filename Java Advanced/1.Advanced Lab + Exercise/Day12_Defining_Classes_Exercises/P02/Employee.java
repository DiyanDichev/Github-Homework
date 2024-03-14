package Day12_Defining_Classes_Exercises.P02;

public class Employee {
    private static final String EMAIL_DEF_VALUE = "n/a";
    private static final int AGE_DEF_VALUE = -1;
    private String name;
    private double salary;
    private String email;
    private int age;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.email = Employee.EMAIL_DEF_VALUE;
        this.age = Employee.AGE_DEF_VALUE;
    }

    public Employee(String name, double salary, String email) {
        this(name, salary);
        this.email = email;
    }

    public Employee(String name, double salary, int age) {
        this(name, salary);
        this.age = age;
    }

    public Employee(String name, double salary, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getInfo() {
        return String.format("%s %.2f %s %d",
                this.name, this.salary, this.email, this.age);
    }
}