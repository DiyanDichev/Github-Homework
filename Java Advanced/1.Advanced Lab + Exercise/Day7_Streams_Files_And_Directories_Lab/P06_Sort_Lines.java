package Day7_Streams_Files_And_Directories_Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class P06_Sort_Lines {
    public static void main(String[] args) throws IOException {

        Path pathRead = Paths.get("C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day7_Streams_Files_And_Directories_Lab\\input");
        Path pathWrite = Paths.get("C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day7_Streams_Files_And_Directories_Lab\\P06_Sort_Lines_Output");

        List<String> allLines = Files.readAllLines(pathRead);
        Collections.sort(allLines);
        Files.write(pathWrite, allLines);


    }
}
