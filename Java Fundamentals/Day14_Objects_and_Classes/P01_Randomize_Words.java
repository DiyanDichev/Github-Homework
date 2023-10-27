package Day14_Objects_and_Classes;

import java.util.*;
import java.util.stream.Collectors;

public class P01_Randomize_Words {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> inputWords = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());
        List<String> result = new ArrayList<>();

        Random rdm = new Random();


        for (int i = 0; i < inputWords.size(); i++) {
            int random = rdm.nextInt(inputWords.size());
            Collections.swap(inputWords, i, random);

        }
        System.out.println(String.join(System.lineSeparator(),inputWords));


        //int inputWordsLen = inputWords.size();

        // for (int i = 0; i < inputWordsLen; i++) {
        //     int index = rdm.nextInt(inputWords.size());

        //     result.add(inputWords.get(index));
        //     inputWords.remove(index);
        // }

        // for (String word : result) {
        //     System.out.println(word);
        // }
    }
}
