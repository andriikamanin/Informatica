package business;

import bean.ListaProvince;
import bean.ListaRegioni;
import bean.Provincia;
import bean.Regione;

import java.util.List;

public class EsRegioni {
    private ListaProvince listaProvince;
    private ListaRegioni listaRegioni;

    public EsRegioni() {
        listaProvince = new ListaProvince();
        listaRegioni = new ListaRegioni();
    }

    public void creaLista(List<String> lista) {
        listaProvince.creaLista(lista);
    }

    public String visualizzaRegioni() {
        // Форматируем список регионов и их провинций
        return listaRegioni.print();
    }

    public void aggiungiRegione(String nome) {
        Regione regione = new Regione(nome);
        listaRegioni.add(regione);
    }

    public void aggiungiProvincia(String codice, String nome, String nomeRegione) {
        Regione regione = listaRegioni.find(nomeRegione);
        if (regione == null) {
            regione = new Regione(nomeRegione);
            listaRegioni.add(regione);
        }
        regione.addProvincia(new Provincia(codice, nome));
    }
}


