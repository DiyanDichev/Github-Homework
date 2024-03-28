package Day12_SOLIDExercises.layouts;

import Day12_SOLIDExercises.enums.LogLevel;

public class ComplexLayout implements Layout {
    @Override
    public String format(String timestamp, LogLevel logLevel, String message) {
        return String.format("%s <=> %s <=> %s", timestamp, logLevel, message);
    }
}
