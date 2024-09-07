package bean;

public class PilaProdotti {
    private Prodotto top;

    public PilaProdotti() {
        top = null;
    }

    public void addTop(Prodotto nuovoProdotto) {
        nuovoProdotto.setNext(top);
        top = nuovoProdotto;

    }

    public void aggiungiProdotto(String nome, String peso, String mercato) {
        Prodotto nuovoProdotto = new Prodotto(nome, peso, mercato);
        addTop(nuovoProdotto);
    }

    public String visualizzaPila(){

        StringBuilder elenco = new StringBuilder();

        Prodotto current = top;
        while(current != null){
            elenco.append(current.toString()).append("\n");
            current = current.getNext();
        }
        return elenco.toString();
    }


}
