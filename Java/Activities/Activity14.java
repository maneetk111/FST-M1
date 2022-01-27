package activities;
import java.io.*;
import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("C:/Users/MyPc/Desktop/IBM FST Projects/Activity14.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }

            File fileUtil = FileUtils.getFile("C:/Users/MyPc/Desktop/IBM FST Projects/Activity14.txt");
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            File destDir = new File("resources");
            FileUtils.copyFileToDirectory(file, destDir);
            File newFile = FileUtils.getFile(destDir, "newfile.txt");

            String newFileData = FileUtils.readFileToString(newFile, "UTF8");
            System.out.println("Data in new file: " + newFileData);
        } catch(IOException errMessage) {
            System.out.println(errMessage);
        }
    }
}