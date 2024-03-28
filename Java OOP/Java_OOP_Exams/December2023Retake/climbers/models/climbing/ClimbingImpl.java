package Java_OOP_Exams.December2023Retake.climbers.models.climbing;

import Java_OOP_Exams.December2023Retake.climbers.models.climber.Climber;
import Java_OOP_Exams.December2023Retake.climbers.models.mountain.Mountain;

import java.util.Collection;

public class ClimbingImpl implements Climbing {

    public void conqueringPeaks(Mountain mountain, Collection<Climber> climbers){
        Collection<String> peaks = mountain.getPeaksList();

        for (Climber climber : climbers) {
            while (climber.canClimb() && peaks.iterator().hasNext()){
                climber.climb();

                String currentPeak = peaks.iterator().next();
                climber.getRoster().getPeaks().add(currentPeak);
                peaks.remove(currentPeak);
            }
        }
    }
}
