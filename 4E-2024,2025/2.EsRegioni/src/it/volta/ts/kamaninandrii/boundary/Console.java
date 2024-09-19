package it.volta.ts.kamaninandrii.boundary;

import java.util.List;

import it.volta.ts.kamaninandrii.business.SocietaLinguistica;
import it.volta.ts.kamaninandrii.util.FileUtil;
public class Console {

    private SocietaLinguistica linguistica;
    public Console(){
        linguistica = new SocietaLinguistica();
    }

    public void carica(String filename){
        List<String> lines = FileUtil.readTextFile(filename);
        System.out.println(lines);
        if(lines!=null){
            linguistica.creaLista(lines);
            System.out.println("Lista caricata.");
        }else{
            System.out.println("Impossibile creare la lista!");
        }
    }

    public void start(){
        carica("dati.txt");
        outputListaRegioni();
    }

    public void outputListaRegioni(){
        String listaRegioni = linguistica.visualizzaRegioni();
        System.out.println(listaRegioni);
    }

}
