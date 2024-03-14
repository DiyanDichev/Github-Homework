package Day7_Streams_Files_And_Directories_Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class P01_Read_File {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day7_Streams_Files_And_Directories_Lab\\input";
        FileInputStream inputStream = new FileInputStream(path);

        int currentByte = inputStream.read();
        while (currentByte >= 0){
            System.out.print(Integer.toBinaryString(currentByte) + " ");
            currentByte = inputStream.read();
        }
    }
}
