package Java_OOP_Exams.December2023RetakeClimbers.climbers.models.climbing;

import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.climber.Climber;
import Java_OOP_Exams.December2023RetakeClimbers.climbers.models.mountain.Mountain;

import java.util.Collection;

public interface Climbing {
    void conqueringPeaks(Mountain mountain, Collection<Climber> climbers);

}
