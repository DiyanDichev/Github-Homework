package Day02_WorkingWithAbstractionExercise.P01CardSuit;

public class Main {
    public static void main(String[] args) {
        CardSuit[] cardSuits = CardSuit.values();
        System.out.printf("Card Suits:%n");
        for (CardSuit cardSuit : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cardSuit.ordinal(), cardSuit);
        }
    }
}