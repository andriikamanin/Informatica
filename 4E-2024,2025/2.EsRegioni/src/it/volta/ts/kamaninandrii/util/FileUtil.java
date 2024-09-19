package it.volta.ts.kamaninandrii.util;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Paths;
import java.util.List;

public class FileUtil {
    public static List<String> readTextFile(String filename){
        Path filePath = Paths.get(filename);
        try{
            return Files.readAllLines(filePath);
        }catch(IOException e){
            return null;
        }
    }
}
