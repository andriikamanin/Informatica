package boundary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaricaDalFile {
    public List<String> carica() {
        String nomeDelFile = "cantanti.txt";
        List<String>dati= new ArrayList<>();
        File file = new File(nomeDelFile);
        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                dati.add(scanner.nextLine());
            }


        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        return dati;
    }
}
