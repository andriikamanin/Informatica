package bean;

public class Prodotto {
    private String nome;
    private String peso;
    private String mercato;

    private Prodotto next;

    @Override
    public String toString() {
        return nome + " " + peso + " " + mercato;
    }

    public Prodotto(String nome, String peso, String mercato) {
        this.nome = nome;
        this.peso = peso;
        this.mercato = mercato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
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
