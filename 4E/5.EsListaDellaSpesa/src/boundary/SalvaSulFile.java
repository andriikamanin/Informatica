package boundary;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class SalvaSulFile {
    public void creaElenco(String[] lista){
        System.out.println(lista);
        for(String str : lista){
            String[] parti = str.split("\\s+");
            System.out.println(parti.length);

            if(parti.length == 3) {
                String nome = parti[0];
                String quantita = parti[1];
                String mercato = parti[2];
                String prodotto = nome + " " + quantita + " " + mercato;
                salva(prodotto, mercato);
                System.out.println("Salva " + prodotto);
            }
        }




    }
    public void salva(String prodotto, String filePath){
        try(FileWriter writer = new FileWriter(filePath, true)){
            writer.write(prodotto);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
