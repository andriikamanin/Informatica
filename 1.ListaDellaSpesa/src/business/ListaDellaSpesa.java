package business;

import bean.PilaProdotti;

public class ListaDellaSpesa {

    private PilaProdotti pilaProdotti;

    public ListaDellaSpesa() {
        pilaProdotti = new PilaProdotti();
    }
    public void aggiungiProdotto(String nome, String peso, String mercato){
        pilaProdotti.aggiungiProdotto(nome, peso, mercato);
    }
    public String visualizzaPila(){
        String elenco = pilaProdotti.visualizzaPila();
        return elenco;
    }

}
