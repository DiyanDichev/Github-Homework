package Java_OOP_Exams.December2023RetakeClimbers.climbers.models.climber;

import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.roster.Roster;

public interface Climber {
    String getName();

    double getStrength();

    boolean canClimb();

    Roster getRoster();


    void climb();
}
