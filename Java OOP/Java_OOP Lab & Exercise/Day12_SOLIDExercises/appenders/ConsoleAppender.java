package Day12_SOLIDExercises.appenders;

import Day12_SOLIDExercises.enums.LogLevel;
import Day12_SOLIDExercises.layouts.Layout;

public class ConsoleAppender extends BaseAppender {
    private Layout layout;

    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String timeStamp, LogLevel level, String message) {
        counter++;
        System.out.printf("%s%n",getLayout().format(timeStamp, level, message));
    }
}
