package Java_OOP_Exams.April2023Regular.robotService.entities.robot;

public class FemaleRobot extends BaseRobot{

    private static int INITIAL_KILOGRAMS = 7;
    public FemaleRobot(String name, String kind, double price) {
        super(name, kind, INITIAL_KILOGRAMS, price);
    }

}
