package Java_OOP_Exams.April2023Regular.robotService.entities.services;

import Java_OOP_Exams.April2023Regular.robotService.entities.robot.Robot;
import Java_OOP_Exams.April2023Regular.robotService.entities.supplements.Supplement;

import java.util.Collection;

public interface Service {
    String getName();

    void setName(String name);

    Collection<Robot> getRobots();

    Collection<Supplement> getSupplements();

    void addRobot(Robot robot);

    void removeRobot(Robot robot);

    void addSupplement(Supplement supplement);

    void feeding();

    int sumHardness();

    String getStatistics();
}
