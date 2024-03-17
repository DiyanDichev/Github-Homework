package Day10_List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P06_Cards_Game {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> firstPlayerDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondPlayerDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String winner = "";
        int sum = 0;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            int firstPlayerCard = firstPlayerDeck.get(0);
            int secondPlayerCard = secondPlayerDeck.get(0);
            if(firstPlayerCard > secondPlayerCard){
                int cardToHold = firstPlayerCard;
                firstPlayerDeck.add(secondPlayerDeck.get(0));
                firstPlayerDeck.remove(Integer.valueOf(firstPlayerCard));
                secondPlayerDeck.remove(Integer.valueOf(secondPlayerCard));
                firstPlayerDeck.add(cardToHold);
            } else if (secondPlayerCard > firstPlayerCard) {
                int cardToHold = secondPlayerCard;
                secondPlayerDeck.add(firstPlayerDeck.get(0));
                secondPlayerDeck.remove(Integer.valueOf(secondPlayerCard));
                firstPlayerDeck.remove(Integer.valueOf(firstPlayerCard));
                secondPlayerDeck.add(cardToHold);
            }else {
                firstPlayerDeck.remove(Integer.valueOf(firstPlayerCard));
                secondPlayerDeck.remove(Integer.valueOf(secondPlayerCard));
            }
            if(firstPlayerDeck.size() == 0){
                winner = "Second";
                for (int j = 0; j < secondPlayerDeck.size(); j++) {
                    sum += secondPlayerDeck.get(j);
                }
                break;
            }else if (secondPlayerDeck.size() == 0){
                winner = "First";
                for (int j = 0; j < firstPlayerDeck.size(); j++) {
                    sum += firstPlayerDeck.get(j);
                }
                break;
            }
        }
        System.out.printf("%s player wins! Sum: %d",winner, sum);
    }
}
