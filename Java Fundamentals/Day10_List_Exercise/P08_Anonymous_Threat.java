package Day10_List_Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P08_Anonymous_Threat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> texts = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            if (command.contains("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);

                if (startIndex < 0) {
                    startIndex = 0;
                }

                if (endIndex > texts.size() - 1) {
                    endIndex = texts.size() - 1;
                }

                if (startIndex >= 0 && startIndex <= texts.size() - 1 && endIndex >= 0 && endIndex <= texts.size() - 1) {
                    String resultMerge = "";
                    for (int index = startIndex; index <= endIndex; index++) {
                        String current = texts.get(index);
                        resultMerge += current;
                    }
                    for (int index = startIndex; index <= endIndex; index++) {
                        texts.remove(startIndex);
                    }
                    texts.add(startIndex, resultMerge);
                }
            } else if (command.contains("divide")) {
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]); //брой на частите

                if (index >= 0 && index <= texts.size() - 1) {
                    String textForDivide = texts.get(index);
                    texts.remove(index);
                    int countSymbolsPerPart = textForDivide.length() / parts;
                    int beginIndex = 0;
                    for (int part = 1; part < parts; part++) {
                        String textPerPart = textForDivide.substring(beginIndex, beginIndex + countSymbolsPerPart);
                        texts.add(index, textPerPart);
                        index++;
                        beginIndex += countSymbolsPerPart;
                    }

                    String textLastParts = textForDivide.substring(beginIndex, textForDivide.length());
                    texts.add(index, textLastParts);
                }

            }


            command = scanner.nextLine();
        }

        System.out.println(String.join(" ", texts));

    }
}