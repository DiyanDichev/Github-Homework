package Day8_Streams_Files_And_Directories_Exercises;

import java.io.*;

public class P01_Sum_Lines {
    public static void main(String[] args) {

        String path = "C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day8_Streams_Files_And_Directories_Exercises\\input.txt";


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            bufferedReader.readLine();

            String line = bufferedReader.readLine();
            while (line != null){
                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    char symbol = line.charAt(i);
                    sum += symbol;
                }
                System.out.println(sum);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}