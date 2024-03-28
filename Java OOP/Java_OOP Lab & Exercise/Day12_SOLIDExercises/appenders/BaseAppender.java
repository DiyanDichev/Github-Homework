package Day12_SOLIDExercises.appenders;

import Day12_SOLIDExercises.layouts.Layout;

public abstract class BaseAppender implements Appender {
    private Layout layout;
    protected int counter;

    protected BaseAppender(Layout layout) {
        this.layout = layout;
    }

    @Override
    public Layout getLayout() {
        return layout;
    }

    @Override
    public int getMessagesCount() {
        return counter;
    }
}
