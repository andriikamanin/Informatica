package business;

import bean.ListaCantanti;
import bean.PilaCantanti;

import java.util.List;

public class Festival {
    private ListaCantanti listaCantanti;
    private PilaCantanti pilaCantanti;
    public Festival() {
        listaCantanti = new ListaCantanti();
        pilaCantanti = new PilaCantanti();
    }

    //Per lista cantanti

    public void aggiungiInLista(String nome, String cognome, String paese){
        listaCantanti.aggiungiCantante(nome, cognome, paese);
    }

    public String visualizzaLista(){

        return listaCantanti.visualizza();
    }
    public String ricercaPerCognome(String cognome){
        return listaCantanti.ricercaPerChiave(cognome);
    }
    public void creaLista(List<String> lista){
        listaCantanti.creaLista(lista);
    }

    //Per la pila cantanti
    public void aggiungiInPila(String nome, String cognome, String paese){
        pilaCantanti.push(nome, cognome, paese);
    }

    public void elemeninaDaPila(){
        pilaCantanti.pop();
    }
    public String visualizzaTesta(){
        return pilaCantanti.peek();
    }
}
