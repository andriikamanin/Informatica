package bean;

public class Provincia {
    private String abbreviazione;
    private String nome;
    private String regione;

    private Provincia next;

    @Override
    public String toString() {
        return super.toString();
    }

    public Provincia(String abbreviazione, String nome, String regione) {
        this.abbreviazione = abbreviazione;
        this.nome = nome;
        this.regione = regione;
    }

    public String getAbbreviazione() {
        return abbreviazione;
    }

    public void setAbbreviazione(String abbreviazione) {
        this.abbreviazione = abbreviazione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    public Provincia getNext() {
        return next;
    }

    public void setNext(Provincia next) {
        this.next = next;
    }
}
