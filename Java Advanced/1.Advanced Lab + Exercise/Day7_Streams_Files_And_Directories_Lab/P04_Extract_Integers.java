package Day7_Streams_Files_And_Directories_Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P04_Extract_Integers {
    public static void main(String[] args) throws FileNotFoundException {

        String pathRead = "C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day7_Streams_Files_And_Directories_Lab\\input";

        FileInputStream inputStream = new FileInputStream(pathRead);
        Scanner scanner = new Scanner(inputStream);

        while (scanner.hasNext()){
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                System.out.println(number);
            }
            scanner.next();
        }
    }
}
