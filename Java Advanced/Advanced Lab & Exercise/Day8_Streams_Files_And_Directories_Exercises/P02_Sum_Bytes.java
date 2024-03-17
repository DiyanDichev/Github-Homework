package Day8_Streams_Files_And_Directories_Exercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P02_Sum_Bytes {
    public static void main(String[] args) {

        String path = "C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day8_Streams_Files_And_Directories_Exercises\\input.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine();
            int sum = 0;
            while (line != null){
                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);
                    sum += symbol;
                }
                line = bufferedReader.readLine();
            }
            System.out.println(sum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}