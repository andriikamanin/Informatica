package bean;

public class Provincia {
    private String codice;
    private String nome;

    public Provincia(String codice, String nome) {
        this.codice = codice;
        this.nome = nome;
    }

    public String getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " (" + codice + ")";
    }
}
