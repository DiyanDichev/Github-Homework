package Day8_Streams_Files_And_Directories_Exercises;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class P03_ALL_CAPITALS {
    public static void main(String[] args) {

        String inputPath = "C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day8_Streams_Files_And_Directories_Exercises\\input.txt";
        String outputPath = "C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day8_Streams_Files_And_Directories_Exercises\\output.txt";

        try (BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
             BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))) {

            String line = reader.readLine();

            while (line != null){
                writer.write(line.toUpperCase());
                writer.newLine();
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
