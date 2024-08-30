package boundary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLoader {
    public List<String> loadFromFile() {
        List<String> data = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("elenco.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        return data;
    }
}
