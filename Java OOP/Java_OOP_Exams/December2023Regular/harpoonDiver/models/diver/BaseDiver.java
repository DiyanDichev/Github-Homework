package Java_OOP_Exams.December2023Regular.harpoonDiver.models.diver;

import Java_OOP_Exams.December2023Regular.harpoonDiver.common.ExceptionMessages;
import Java_OOP_Exams.December2023Regular.harpoonDiver.models.seaCatch.BaseSeaCatch;
import Java_OOP_Exams.December2023Regular.harpoonDiver.models.seaCatch.SeaCatch;

public  abstract class BaseDiver implements Diver{

    private String name;
    private double oxygen;
    private SeaCatch seaCatch;

    private static final double DEFAULT_OXYGEN_CONSUMPTION = 30;

    public BaseDiver(String name, double oxygen) {
        this.name = name;
        setOxygen(oxygen);
        this.seaCatch = new BaseSeaCatch();
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.DIVER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    public void setOxygen(double oxygen) {

        if (oxygen < 0) {
            throw new IllegalArgumentException(ExceptionMessages.DIVER_OXYGEN_LESS_THAN_ZERO);
        }
        this.oxygen = oxygen;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getOxygen() {
        return oxygen;
    }

    @Override
    public boolean canDive() {
        return oxygen > 0;
    }

    @Override
    public SeaCatch getSeaCatch() {
        return seaCatch;
    }

    @Override
    public void shoot() {
        this.oxygen = Math.max(0 , this.oxygen - DEFAULT_OXYGEN_CONSUMPTION);
    }
}
