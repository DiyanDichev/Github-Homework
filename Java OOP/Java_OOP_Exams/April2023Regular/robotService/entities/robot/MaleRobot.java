package Java_OOP_Exams.April2023Regular.robotService.entities.robot;

public class MaleRobot extends BaseRobot{

    private static int INITIAL_KILOGRAMS = 9;
    public MaleRobot(String name, String kind, double price) {
        super(name, kind, INITIAL_KILOGRAMS, price);
    }

}
