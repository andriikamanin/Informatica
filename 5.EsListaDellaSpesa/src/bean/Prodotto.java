package bean;

public class Prodotto {
    private String nome;
    private String quantita; //in grammi
    private String mercato;

    private Prodotto next;

    @Override
    public String toString() {
        return nome + " " + quantita + " " + mercato;
    }

    public Prodotto(String nome, String quantita, String mercato) {
        this.nome = nome;
        this.quantita = quantita;
        this.mercato = mercato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantita() {
        return quantita;
    }

    public void setQuantita(String quantita) {
        this.quantita = quantita;
    }

    public String getMercato() {
        return mercato;
    }

    public void setMercato(String mercato) {
        this.mercato = mercato;
    }

    public Prodotto getNext() {
        return next;
    }

    public void setNext(Prodotto next) {
        this.next = next;
    }
}
