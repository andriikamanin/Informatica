import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLoader {
    public String loadFromFile() {
        StringBuilder data = new StringBuilder();  // Use StringBuilder for efficient string concatenation
        String filePath = "stringa.txt";  // Path to the file

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {  // Read lines using readLine() method
                data.append(line);  // Append each line to the StringBuilder
                data.append(System.lineSeparator());  // Optional: Add newline for readability
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            // Consider logging the error or notifying the user
        }

        return data.toString();  // Convert StringBuilder to String before returning
    }
}