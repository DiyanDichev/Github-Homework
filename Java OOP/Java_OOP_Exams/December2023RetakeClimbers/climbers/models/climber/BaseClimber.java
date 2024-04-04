package Java_OOP_Exams.December2023RetakeClimbers.climbers.models.climber;

import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.roster.Roster;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.roster.RosterImpl;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.common.ExceptionMessages;

public abstract class BaseClimber implements Climber{

    private String name;
    private double strength;
    private Roster roster;

    public BaseClimber(String name, double strength) {
        this.setName(name);
        this.setStrength(strength);
        this.roster = new RosterImpl();
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name == null || name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.CLIMBER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }
    @Override
    public double getStrength() {
        return this.strength;
    }

    public void setStrength(double strength) {
        if(strength < 0){
            throw new IllegalArgumentException(ExceptionMessages.CLIMBER_STRENGTH_LESS_THAN_ZERO);
        }
        this.strength = strength;
    }

    @Override
    public boolean canClimb() {
        return this.strength > 0;
    }

    @Override
    public Roster getRoster() {
        return this.roster;
    }

    @Override
    public void climb(){
        double climbStrength = this.getClass().getSimpleName().equals("WallClimber") ?
                30 : 60;
        this.setStrength(Math.max(0,this.strength - climbStrength));
    };
}
