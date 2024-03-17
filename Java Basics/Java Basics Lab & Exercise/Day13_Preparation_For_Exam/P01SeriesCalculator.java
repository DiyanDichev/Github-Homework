package Day13_Preparation_For_Exam;

import java.util.Scanner;

public class P01SeriesCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int seasonCount = Integer.parseInt(scanner.nextLine());
        int episodesCount = Integer.parseInt(scanner.nextLine());
        double episodeLength = Double.parseDouble(scanner.nextLine());


        double oneEpisodeLength  = (episodeLength * 0.20) + episodeLength;
        double lastEpisodeLength = seasonCount * 10;
        double totalTime =  oneEpisodeLength * episodesCount * seasonCount + lastEpisodeLength;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", seriesName , totalTime);
    }
}
