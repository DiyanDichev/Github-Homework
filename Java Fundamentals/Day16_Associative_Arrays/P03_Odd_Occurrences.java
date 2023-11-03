package Day16_Associative_Arrays;

import java.util.*;

public class P03_Odd_Occurrences {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] words =  Arrays.stream(scanner.nextLine().split(" "))
                .map(word -> word.toLowerCase())
                .toArray(String[]::new);

        LinkedHashMap<String, Integer> wordsMap = new LinkedHashMap<>();

        for (String word : words){
            if (wordsMap.containsKey(word)){
                wordsMap.put(word, wordsMap.get(word) + 1);
            }else {
                wordsMap.put(word, 1);
            }
        }
      //String[] result = wordsMap
      //        .entrySet()
      //        .stream()
      //        .filter(entry -> entry.getValue() % 2 != 0) // също валидно решението на кода от ред 31 до 36
      //        .map(entry -> entry.getKey())
      //        .toArray(String[]:: new);


        List<String> result = new ArrayList<>();
        for (Map.Entry<String,  Integer> entry : wordsMap.entrySet()){
            if( entry.getValue() % 2 != 0){
                result.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", result));
    }
}
