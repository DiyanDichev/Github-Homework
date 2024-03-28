package Java_OOP_Exams.December2023Retake.climbers.models.climber;

import Java_OOP_Exams.December2023Retake.climbers.common.ExceptionMessages;
import Java_OOP_Exams.December2023Retake.climbers.models.roster.Roster;
import Java_OOP_Exams.December2023Retake.climbers.models.roster.RosterImpl;

public abstract class BaseClimber implements Climber{
    private String name;
    private double strength;
    private Roster roster;
    public BaseClimber(String name, double strength) {
        this.name = name;
        setStrength(strength);
        this.roster = new RosterImpl();
    }
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new NullPointerException(ExceptionMessages.CLIMBER_NAME_NULL_OR_EMPTY);
        }
        this.name = name;
    }
    public void setStrength(double strength) {
        if (strength < 0) {
            throw new IllegalArgumentException(ExceptionMessages.CLIMBER_STRENGTH_LESS_THAN_ZERO);
        }
        this.strength = strength;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getStrength() {
        return strength;
    }
    @Override
    public boolean canClimb() {
        return strength > 0;
    }
    @Override
    public Roster getRoster() {
        return roster;
    }
    @Override
    abstract public void climb();
}
