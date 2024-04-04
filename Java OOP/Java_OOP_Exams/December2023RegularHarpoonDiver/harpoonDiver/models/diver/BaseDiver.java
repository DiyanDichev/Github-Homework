package Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.diver;

import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.seaCatch.SeaCatch;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.common.ExceptionMessages;
import Java_OOP_Exams.December2023RegularHarpoonDiver.harpoonDiver.models.seaCatch.BaseSeaCatch;

public abstract class BaseDiver implements Diver{

    private String name;
    private double oxygen;
    private SeaCatch seaCatch;

    public BaseDiver(String name, double oxygen) {
        this.setName(name);
        this.setOxygen(oxygen);
        this.seaCatch = new BaseSeaCatch();
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.DIVER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }

    @Override
    public double getOxygen() {
        return this.oxygen;
    }

    public void setOxygen(double oxygen) {

        if (oxygen < 0) {
            throw new IllegalArgumentException(ExceptionMessages.DIVER_OXYGEN_LESS_THAN_ZERO);
        }
        this.oxygen = oxygen;
    }

    @Override
    public boolean canDive() {
        return this.oxygen > 0;
    }

    @Override
    public SeaCatch getSeaCatch() {
        return this.seaCatch;
    }

    @Override
    public void shoot(){
        double oxygen = this.oxygen;
        if(oxygen - 30 > 0){
            oxygen -= 30;
        }else {
            oxygen = 0;
        }
        this.oxygen = oxygen;
    }
}
