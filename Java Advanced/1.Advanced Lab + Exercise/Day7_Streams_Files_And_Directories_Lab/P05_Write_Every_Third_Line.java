package Day7_Streams_Files_And_Directories_Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class P05_Write_Every_Third_Line {
    public static void main(String[] args) throws FileNotFoundException {

        String pathRead = "C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day7_Streams_Files_And_Directories_Lab\\input";
        String pathWrite = "C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day7_Streams_Files_And_Directories_Lab\\P05_Write_Every_Third_Line";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(pathWrite);

        Scanner scanner = new Scanner(inputStream);
        PrintWriter writer = new PrintWriter(outputStream);

        int count = 1;
        String line = scanner.nextLine();
        while (scanner.hasNextLine()) {
            if (count % 3 == 0){
                writer.println(line);
            }
            count++;
            line = scanner.nextLine();
        }
        writer.close();
    }
}
