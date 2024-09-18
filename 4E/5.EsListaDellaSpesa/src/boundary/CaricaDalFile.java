package boundary;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaricaDalFile {
    public List<String> carica(){
        List<String> dati = new ArrayList<String>();
        String filePath = "spesa.txt";
        File file = new File(filePath);
        try(Scanner scanner = new Scanner(file)) {
            while(scanner.hasNextLine()) {
                dati.add(scanner.nextLine());
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(dati);
        return dati;
    }
}
