package Java_OOP_Exams.April2023Regular.robotService.entities.services;

import Java_OOP_Exams.April2023Regular.robotService.common.ConstantMessages;
import Java_OOP_Exams.April2023Regular.robotService.common.ExceptionMessages;
import Java_OOP_Exams.April2023Regular.robotService.entities.robot.Robot;
import Java_OOP_Exams.April2023Regular.robotService.entities.supplements.Supplement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public abstract class BaseService implements Service{

    private String name;
    private int capacity;
    private Collection<Supplement>supplements;
    private Collection<Robot>robots;

    public BaseService(String name, int capacity) {
        this.setName(name);
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
        if (name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.SERVICE_NAME_CANNOT_BE_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public Collection<Robot> getRobots() {
        return this.robots;
    }

    @Override
    public Collection<Supplement> getSupplements() {
        return this.supplements;
    }

    @Override
    public void addRobot(Robot robot) {
        if(capacity < this.robots.size()){
            throw new IllegalArgumentException(ConstantMessages.NOT_ENOUGH_CAPACITY_FOR_ROBOT);
        }
        this.robots.add(robot);
    }

    @Override
    public void removeRobot(Robot robot) {
        this.robots.remove(robot);
    }

    @Override
    public void addSupplement(Supplement supplement) {
        this.supplements.add(supplement);
    }

    @Override
    public void feeding() {
        this.robots.forEach(Robot::eating);
    }

    @Override
    public int sumHardness() {
        int hardnessSum = this.supplements.stream()
                .mapToInt(Supplement::getHardness)
                .sum();
        return hardnessSum;
    }

    @Override
    public String getStatistics() {
        return String.format("%s %s:\n",this.name, this.getClass().getSimpleName()) +
                String.format("Robots: %s\n", getRobots().isEmpty()
                ? "none"
                : this.getRobots().stream().map(Robot::getName).collect(Collectors.joining(" ")).trim()) +
                String.format("Supplements: %s Hardness: %s\n",this.getSupplements().size(),this.sumHardness());
    }
}
