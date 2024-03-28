package Java_OOP_Exams.December2023Retake.climbers.core;

public interface Controller {
    String addClimber(String type, String climberName);

    String addMountain(String mountainName, String... peaks);

    String removeClimber(String climberName);

    String startClimbing(String mountainName);

    String getStatistics();

}
