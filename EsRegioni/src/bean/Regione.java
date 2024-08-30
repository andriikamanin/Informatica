package bean;

public class Regione {
    private String nome;
    private Provincia headProvince;
    private Regione next;

    public Regione(String nome) {
        this.nome = nome;
        this.headProvince = null;
        this.next = null;
    }

    public String getNome() {
        return nome;
    }

    public Provincia getHeadProvince() {
        return headProvince;
    }

    public void setHeadProvince(Provincia headProvince) {
        this.headProvince = headProvince;
    }

    public Regione getNext() {
        return next;
    }

    public void setNext(Regione next) {
        this.next = next;
    }
}
