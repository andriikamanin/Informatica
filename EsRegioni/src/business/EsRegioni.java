package business;

import bean.ListaProvince;

import java.util.List;

public class EsRegioni {
    ListaProvince listaProvince;
    public void aggiungiProvincia(String abbreviazione, String nome, String regione){
        listaProvince.aggiungiProvincia(abbreviazione, nome, regione);
    }

    
}
