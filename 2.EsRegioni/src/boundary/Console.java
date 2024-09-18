package boundary;

import business.EsRegioni;

import java.util.List;

public class Console {
    private FileLoader fileLoader;
    private EsRegioni esRegioni;

    public Console(String filePath) {
        fileLoader = new FileLoader(filePath);
        esRegioni = new EsRegioni();
    }

    public void start() {
        caricaDalFile();
        visualizzaRegioni();
    }

    private void caricaDalFile() {
        List<String> elenco = fileLoader.loadFromFile();
        if (elenco.isEmpty()) {
            System.out.println("No data found in file.");
        } else {
            esRegioni.creaLista(elenco);
        }
    }

    private void visualizzaRegioni() {
        String output = esRegioni.visualizzaRegioni();
        if (output.trim().isEmpty()) {
            System.out.println("No regions available.");
        } else {
            System.out.println(output);
        }
    }
}


