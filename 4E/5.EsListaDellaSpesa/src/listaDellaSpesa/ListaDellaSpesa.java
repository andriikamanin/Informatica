package listaDellaSpesa;

import bean.ListaProdotti;

import java.util.List;

public class ListaDellaSpesa {
    private ListaProdotti listaProdotti;
    public ListaDellaSpesa(){
        listaProdotti = new ListaProdotti();
    }

    public void creaElenco(List<String> lista){
        listaProdotti.creaLista(lista);
    }

    public String outputElenco(){
        String elenco = listaProdotti.visualizza();
        return elenco;
    }
}
