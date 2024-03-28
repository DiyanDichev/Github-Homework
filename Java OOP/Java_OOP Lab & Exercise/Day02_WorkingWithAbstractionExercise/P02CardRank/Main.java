package Day02_WorkingWithAbstractionExercise.P02CardRank;

public class Main {
    public static void main(String[] args) {
        CardRank[] cardRanks = CardRank.values();
        System.out.printf("Card Ranks:%n");
        for (CardRank cardRank : cardRanks) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardRank.ordinal(), cardRank);
        }
    }
}