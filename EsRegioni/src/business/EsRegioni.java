package business;

import bean.ListaProvince;

import java.util.List;

public class EsRegioni {
    ListaProvince listaProvince;
    public EsRegioni(){
        listaProvince = new ListaProvince();
    }

    public void aggiungiProvincia(String abbreviazione, String nome, String regione){
        listaProvince.aggiungiProvincia(abbreviazione, nome, regione);
    }

    public void creaLista(List<String> lista){
        listaProvince.creaLista(lista);
    }
    public String outputElenco(){
        String elenco = listaProvince.visualizzaLista();
        System.out.println(elenco);
        return elenco;
    }

}
