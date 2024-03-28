package Java_OOP_Exams.December2023Regular.harpoonDiver.models.diver;

import Java_OOP_Exams.December2023Regular.harpoonDiver.models.seaCatch.SeaCatch;

public interface Diver {
    String getName();

    double getOxygen();

    boolean canDive();

    SeaCatch getSeaCatch();

    void shoot();
}
