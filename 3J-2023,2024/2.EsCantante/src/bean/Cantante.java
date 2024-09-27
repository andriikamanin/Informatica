package bean;

public class Cantante {
    private String nome;
    private String cognome;
    private String paese;

    private Cantante next;

    public Cantante(String nome, String cognome, String paese) {
        this.nome = nome;
        this.cognome = cognome;
        this.paese = paese;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getPaese() {
        return paese;
    }

    public void setPaese(String paese) {
        this.paese = paese;
    }

    public Cantante getNext() {
        return next;
    }

    public void setNext(Cantante next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return nome + " " + cognome + ", " + paese;
    }
}
