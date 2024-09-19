package it.volta.ts.kamaninandrii.bean;

public class Provincia {
    private String nome;
    private String abbreviazione;

    private Provincia next;

    @Override
    public String toString() {
        return nome + " " + abbreviazione;
    }

    public Provincia(String nome, String abbreviazione) {
        this.nome = nome;
        this.abbreviazione = abbreviazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbbreviazione() {
        return abbreviazione;
    }

    public void setAbbreviazione(String abbreviazione) {
        this.abbreviazione = abbreviazione;
    }

    public Provincia getNext() {
        return next;
    }

    public void setNext(Provincia next) {
        this.next = next;
    }
}
