package Day12_SOLIDExercises.appenders;

import Day12_SOLIDExercises.enums.LogLevel;
import Day12_SOLIDExercises.layouts.Layout;

public interface Appender {
    void append(String timeStamp, LogLevel level, String message);
    Layout getLayout();
    int getMessagesCount();
}
