package Day7_Streams_Files_And_Directories_Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P02_Write_to_File {
    public static void main(String[] args) throws IOException {

        String pathRead = "C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day7_Streams_Files_And_Directories_Lab\\P01_Read_File_input";
        String pathWrite = "C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day7_Streams_Files_And_Directories_Lab\\P02_Write_To_File_Output";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(pathWrite);

        int currentByte = inputStream.read();
        while (currentByte >= 0){
            char currentSymbol = (char) currentByte;
            if(currentSymbol != ',' && currentSymbol != '.' && currentSymbol != '!' && currentSymbol != '?'){
             outputStream.write(currentByte);
            }
            currentByte = inputStream.read();
        }
        inputStream.close();
        outputStream.close();
    }
}
