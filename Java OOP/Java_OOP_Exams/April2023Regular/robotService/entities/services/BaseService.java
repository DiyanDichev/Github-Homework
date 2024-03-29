package Java_OOP_Exams.April2023Regular.robotService.entities.services;

import Java_OOP_Exams.April2023Regular.robotService.common.ConstantMessages;
import Java_OOP_Exams.April2023Regular.robotService.common.ExceptionMessages;
import Java_OOP_Exams.April2023Regular.robotService.entities.robot.Robot;
import Java_OOP_Exams.April2023Regular.robotService.entities.supplements.Supplement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BaseService implements Service {

    private String name;
    private int capacity;
    private Collection<Supplement> supplements;
    private Collection<Robot> robots;

    public BaseService(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.supplements = new ArrayList<>();
        this.robots = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.SERVICE_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public Collection<Supplement> getSupplements() {
        return supplements;
    }

    public void setSupplements(Collection<Supplement> supplements) {
        this.supplements = supplements;
    }

    @Override
    public Collection<Robot> getRobots() {
        return robots;
    }

    public void setRobots(Collection<Robot> robots) {
        this.robots = robots;
    }

    public void addRobot(Robot robot) {
        if (this.getRobots().size() < this.capacity) {
            this.robots.add(robot);
            return;
        }
        throw new IllegalStateException(ConstantMessages.NOT_ENOUGH_CAPACITY_FOR_ROBOT);
    }

    public void removeRobot(Robot robot) {
        this.getRobots().remove(robot);
    }

    public void addSupplement(Supplement supplement) {
        this.getSupplements().add(supplement);
    }

    public void feeding() {
        for (Robot robot : this.getRobots()) {
            robot.eating();
        }
    }

    public int sumHardness() {
        int sum = 0;
        for (Supplement supplement : this.getSupplements()) {
            sum += supplement.getHardness();
        }
        return sum;
    }

    @Override
    public String getStatistics() {
        return String.format("%s %s:\n", this.name, this.getClass().getSimpleName())
                + String.format("Robots: %s\n", getRobots().isEmpty()
                ? "none"
                : this.getRobots().stream().map(Robot::getName).collect(Collectors.joining(" ")).trim())
                + String.format("Supplements: %s Hardness: %s\n", this.getSupplements().size(), this.sumHardness());
    }
}
