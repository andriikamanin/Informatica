package bean;

public class PilaProdotti {
    private Prodotto head;

    public PilaProdotti() {
        head = null;
    }
    public void creaPila(String[] lista){
        for(String s : lista){
            String[] parti = s.split(" ");
            String nome = parti[0];
            String quantita = parti[1];
            String mercato = parti[2];
            aggiungi(nome, quantita, mercato);
        }
    }

    public void aggiungi(String nome, String quantita, String mercato){
        if(isEmpty()){
            head = new Prodotto(nome, quantita, mercato);
        }
        Prodotto nuovoProdotto = new Prodotto(nome, quantita, mercato);
        nuovoProdotto.setNext(head);
        head = nuovoProdotto;
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

            }
        }
    }
}
