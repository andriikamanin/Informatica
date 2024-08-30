package boundary;

import business.EsRegioni;

import java.util.List;
public class Console {
    FileLoader fileLoader;
    EsRegioni esRegioni;

    public Console(){
        fileLoader = new FileLoader();

        esRegioni = new EsRegioni();
    }

    public void start() {

        caricaDalFile();
        bubbleSort();
        visualizzaElenco();
        visualizzaRegioni();

    }
    public void bubbleSort(){
        esRegioni.bubbleSort();
    }
    public void caricaDalFile(){
        List<String> elenco = fileLoader.loadFromFile();

        esRegioni.creaLista(elenco);
    }

    public void visualizzaElenco(){
        String elenco = esRegioni.outputElenco();
        System.out.println(elenco);
    }
    public void visualizzaRegioni(){
        esRegioni.visualizzaRegioni();
    }

}
