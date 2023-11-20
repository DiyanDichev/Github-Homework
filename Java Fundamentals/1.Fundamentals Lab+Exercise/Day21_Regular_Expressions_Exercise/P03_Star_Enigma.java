package Day21_Regular_Expressions_Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03_Star_Enigma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            int counter = 0;
            for (int j = 0; j < input.length(); j++) {
                char letterCheck = input.charAt(j);
                if(letterCheck == 's' || letterCheck == 't' || letterCheck == 'a' || letterCheck == 'r' ||
                        letterCheck == 'S' || letterCheck == 'T' || letterCheck == 'A' || letterCheck == 'R') {
                    counter++;
                }
            }
            String decryptedInput = "";
            for (int j = 0; j < input.length(); j++) {
                char decryptedLetter = (char) (input.charAt(j) - counter);
                decryptedInput += decryptedLetter;
            }
            String regex = "@(?<planetName>[A-Z][a-z]+)[^@\\-!:]*:(?<population>\\d+)[^@\\-!:]*!(?<attackType>[AD])![^@\\-!:]*->(?<soldiers>\\d+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decryptedInput);
            if(matcher.find()){
                if(matcher.group("attackType").equals("A")){
                    attackedPlanets.add(matcher.group("planetName"));
                } else if(matcher.group("attackType").equals("D")){
                    destroyedPlanets.add(matcher.group("planetName"));
                }
            }
        }
        Collections.sort(attackedPlanets);
        System.out.printf("Attacked planets: %d\n",attackedPlanets.size());
        attackedPlanets.forEach(name -> System.out.println("-> " + name));

        Collections.sort(destroyedPlanets);
        System.out.printf("Destroyed planets: %d\n",destroyedPlanets.size());
        destroyedPlanets.forEach(name -> System.out.println("-> " + name));
    }
}
