package bean;

import java.util.List;

public class ListaProdotti {
    private Prodotto head;
    public ListaProdotti() {
        head = null;
    }

    public void creaLista(List<String> lista){
        for(String l : lista){
            String[] parti = l.split("\\s+");
            if(parti.length == 3){
                String nome = parti[0];
                String quantita = parti[1];
                String mercato = parti[2];
                aggiungi(nome, quantita, mercato);
                System.out.println(nome);
            }
        }
    }

    public void aggiungi(String nome, String quantita, String mercato){
        Prodotto nuovoProdotto = new Prodotto(nome, quantita, mercato);
        if(isEmpty()){
            head = nuovoProdotto;
        }else{
            Prodotto current = head;
            while(current.getNext()!=null){
                current = current.getNext();
            }
            current.setNext(nuovoProdotto);
        }
    }

    public String visualizza(){
        StringBuilder sb = new StringBuilder();
        Prodotto prodotto = head;
        while(prodotto!=null){
            sb.append(prodotto.toString()).append("\n");
            prodotto = prodotto.getNext();
        }
        return sb.toString();
    }

    public boolean isEmpty(){
        if(head == null) return true;
        else return false;
    }

    public void eleminaHead(){
        Prodotto p = head;
        head = head.getNext();
        p = null;
    }

    public void elemina(String nomeProdotto){
        Prodotto current = head;
        while(current != null){
            if(current.getNome().equals(nomeProdotto)){
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public String controllaPresenza(String nomeProdotto){
        if(isEmpty()){
            return "Nessun prodotto non aggiunto.";
        }
        if(head.getNome().equals(nomeProdotto)){
            eleminaHead();
            return "Prodotto " + nomeProdotto+ " e' comprato";
        }

        Prodotto current = head;
        while(current != null){
            if(current.getNome().equals(nomeProdotto)){
                elemina(nomeProdotto);
                return "Prodotto " + nomeProdotto+ " e' comprato";

            }
            current = current.getNext();
        }
        return "Prodotto non trovato";

    }




}
