package bean;

import java.util.List;

public class ListaCantanti {
    private Cantante head;
    public ListaCantanti() {
        this.head = null;
    }

    public void add(Cantante nuovoCantante) {
        if(this.head == null) {
            this.head = nuovoCantante;
        }else{
            Cantante temp = this.head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(nuovoCantante);
        }
    }

    public void aggiungiCantante(String nome, String cognome, String paese) {
        Cantante nuovoCantante = new Cantante(nome, cognome, paese);
        add(nuovoCantante);
    }

    public String visualizza(){
        StringBuilder lista = new StringBuilder();
        Cantante temp = this.head;
        while(temp != null) {
            lista.append(temp.toString()).append("\n");
            temp = temp.getNext();
        }
        return lista.toString();
    }

    public String ricercaPerChiave(String cognome){
        if(head==null){
            return null;
        }
        if(head.getCognome().equals(cognome)){
            return "Cantante trovato:\n"+head.toString();
        }

        Cantante temp = this.head;
        while(temp != null) {

            if(temp.getCognome().equals(cognome)){
                return "Cantante trovato:\n"+ temp.toString();
            }
            temp = temp.getNext();

        }

        return "Cantante non trovato!";
    }


    public void creaLista(List<String> dati){
        for(String lista : dati){
            String []parti = lista.split(",");
            String nome = parti[0];
            String cognome = parti[1];
            String paese = parti[2];
            aggiungiCantante(nome, cognome, paese);
        }
    }
}
