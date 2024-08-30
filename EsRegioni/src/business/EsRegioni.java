package business;

import bean.ListaProvince;
import bean.ListaRegioni;

import java.util.List;

public class EsRegioni {
    ListaProvince listaProvince;
    ListaRegioni listaRegioni;
    public EsRegioni(){
        listaProvince = new ListaProvince();
        listaRegioni = new ListaRegioni();
    }

    public void aggiungiProvincia(String abbreviazione, String nome, String regione){
        listaProvince.aggiungiProvincia(abbreviazione, nome, regione);
    }

    public void creaLista(List<String> lista){
        listaProvince.creaLista(lista);
    }
    public String outputElenco(){
        String elenco = listaProvince.visualizzaLista();

        return elenco;
    }

    public void bubbleSort(){
        listaProvince.bubbleSort();
    }
    public void visualizzaRegioni(){
        listaRegioni.visualizzaLista();
    }

}
