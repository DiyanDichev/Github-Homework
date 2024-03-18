package Day12_SOLIDExercises;

import Day12_SOLIDExercises.appenders.Appender;
import Day12_SOLIDExercises.appenders.ConsoleAppender;
import Day12_SOLIDExercises.appenders.FileAppender;
import Day12_SOLIDExercises.appenders.XmlAppender;
import Day12_SOLIDExercises.enums.LogLevel;
import Day12_SOLIDExercises.layouts.Layout;
import Day12_SOLIDExercises.layouts.SimpleLayout;
import Day12_SOLIDExercises.layouts.XmlLayout;
import Day12_SOLIDExercises.loggers.Logger;
import Day12_SOLIDExercises.loggers.MessageLogger;
import Day12_SOLIDExercises.utilites.LogFile;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int appendersCount = Integer.parseInt(scanner.nextLine());
        Map<Appender, LogLevel> appenderLogLevelMap = new LinkedHashMap<>();
        while (appendersCount-- > 0) {
            String[] tokens = scanner.nextLine().split("\\s+");
            String appenderType = tokens[0];
            String layoutType = tokens[1];
            LogLevel logLevel = tokens.length == 3
                    ? LogLevel.valueOf(tokens[2])
                    : LogLevel.INFO;
            Layout layout = createLayout(layoutType);
            Appender appender = createAppender(appenderType, layout);
            appenderLogLevelMap.put(appender, logLevel);
        }
        Logger logger = new MessageLogger(appenderLogLevelMap);
        String line = scanner.nextLine();
        while (!line.equals("END")) {
            String[] tokens = line.split("\\|");
            LogLevel logLevel = LogLevel.valueOf(tokens[0]);
            String timeStamp = tokens[1];
            String message = tokens[2];
            if (logLevel == LogLevel.INFO) {
                logger.logInfo(timeStamp, message);
            } else if (logLevel == LogLevel.WARNING) {
                logger.logWarning(timeStamp, message);
            } else if (logLevel == LogLevel.ERROR) {
                logger.logError(timeStamp, message);
            } else if (logLevel == LogLevel.CRITICAL) {
                logger.logCritical(timeStamp, message);
            } else if (logLevel == LogLevel.FATAL) {
                logger.logFatal(timeStamp, message);
            }
            line = scanner.nextLine();
        }
        System.out.printf("%s%n",logger.toString());
    }
    private static Appender createAppender(String appenderType, Layout layout) {
        Appender appender = null;
        if (appenderType.equals("ConsoleAppender")) {
            appender = new ConsoleAppender(layout);
        } else if (appenderType.equals("FileAppender")) {
            appender = new FileAppender(layout, new LogFile());
        } else if (appenderType.equals("XmlAppender")) {
            appender = new XmlAppender(layout);
        } else {
            throw new IllegalStateException("Unexpected appender type: " + appenderType);
        }
        return appender;
    }

    private static Layout createLayout(String layoutType) {
        return layoutType.equals("SimpleLayout")
                ? new SimpleLayout() : new XmlLayout();
    }
}
