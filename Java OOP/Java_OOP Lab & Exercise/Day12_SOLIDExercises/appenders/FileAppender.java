package Day12_SOLIDExercises.appenders;

import Day12_SOLIDExercises.enums.LogLevel;
import Day12_SOLIDExercises.layouts.Layout;
import Day12_SOLIDExercises.utilites.File;

public class FileAppender extends BaseAppender {
    private File file;

    public FileAppender(Layout layout, File file) {
        super(layout);
        this.file = file;
    }

    @Override
    public void append(String timeStamp, LogLevel logLevel, String message) {
        counter++;
        file.write(getLayout().format(timeStamp, logLevel, message));
    }

    public File getFile() {
        return file;
    }
}
