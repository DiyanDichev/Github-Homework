package Java_OOP_Exams.August2023Regular.bank.entities.client;

public class Student extends BaseClient{
    public Student(String name, String ID, double income) {
        super(name, ID, 2, income);
    }

    @Override
    public void increase() {
        setInterest(getInterest() + 1);
    }
}
