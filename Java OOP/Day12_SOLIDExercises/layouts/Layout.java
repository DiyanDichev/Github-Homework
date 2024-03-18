package Day12_SOLIDExercises.layouts;

import Day12_SOLIDExercises.enums.LogLevel;

public interface Layout {
    String format(String timeStamp, LogLevel level, String message);
}
