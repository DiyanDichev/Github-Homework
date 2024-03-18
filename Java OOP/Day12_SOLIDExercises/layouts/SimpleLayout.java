package Day12_SOLIDExercises.layouts;

import Day12_SOLIDExercises.enums.LogLevel;

public class SimpleLayout implements Layout{
    @Override
    public String format(String timeStamp, LogLevel level, String message) {
        return String.format("%s – %s – %s", timeStamp, level, message);
    }
}
