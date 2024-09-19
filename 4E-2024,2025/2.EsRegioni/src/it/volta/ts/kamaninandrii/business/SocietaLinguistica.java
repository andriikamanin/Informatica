package it.volta.ts.kamaninandrii.business;

import it.volta.ts.kamaninandrii.bean.ListaRegioni;

import java.util.List;

public class SocietaLinguistica {
    private ListaRegioni listaRegioni;
    public SocietaLinguistica() {
        listaRegioni = new ListaRegioni();
    }

    public void creaLista(List<String> lista){
        listaRegioni.creaLista(lista);
    }

    public String visualizzaRegioni(){
        return listaRegioni.visualizza();
    }




}
