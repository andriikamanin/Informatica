package business;

import bean.ListaStudenti;
import bean.ListaVoti;

public class EsStudente {
    private ListaStudenti listaStudenti;
    private ListaVoti listaVoti;

    public EsStudente() {
        listaStudenti = new ListaStudenti();
        listaVoti = new ListaVoti();

    }

    public void aggiungiStudente(String nome, String cognome, String classe){
        listaStudenti.aggiungi(nome, cognome, classe);

    }

    public String visualizzaStudenti(){
        String lista = listaStudenti.visualizza();
        return lista;
    }
    public String aggiungiVoto(String nome, String cognome, String materia, int voto){
        return listaStudenti.aggiungiVoto(nome, cognome, materia, voto);
    }

}
