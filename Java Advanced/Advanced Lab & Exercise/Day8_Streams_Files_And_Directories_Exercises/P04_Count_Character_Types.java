package Day8_Streams_Files_And_Directories_Exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;

public class P04_Count_Character_Types {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day8_Streams_Files_And_Directories_Exercises\\input.txt";
        String outputPath = "C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day8_Streams_Files_And_Directories_Exercises\\output2.txt";

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> punctuations = Set.of('!', ',', '.', '?');

        int vowelsCounter = 0;
        int punctuationsCounter = 0;
        int othersCounter = 0;
        try (BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))) {

            String line = reader.readLine();

            while (line != null) {
                for (char c : line.toCharArray()) {
                    if (vowels.contains(c)) {
                        vowelsCounter++;
                    } else if (punctuations.contains(c)) {
                        punctuationsCounter++;
                    } else if (c != ' ') {
                        othersCounter++;
                    }
                }
                line = reader.readLine();
            }
            writer.write(String.format("Vowels: %d\n",vowelsCounter));
            writer.write(String.format("Other symbols: %d\n",othersCounter));
            writer.write(String.format("Punctuation: %d\n",punctuationsCounter));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
