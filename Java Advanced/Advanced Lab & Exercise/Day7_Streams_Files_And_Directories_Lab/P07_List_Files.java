package Day7_Streams_Files_And_Directories_Lab;

import java.io.File;

public class P07_List_Files {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\DIDO\\Documents\\SoftUni\\Project\\Java Advance\\src\\Day7_Streams_Files_And_Directories_Lab");

        if(folder.exists()){
            if(folder.isDirectory()){
                File[] allFiles = folder.listFiles();
                for (File file : allFiles) {
                    if(!file.isDirectory()){
                        System.out.printf("%s: [%s]\n",file.getName(),file.length());
                    }
                }
            }
        }
    }
}