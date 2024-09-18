package bean;

public class Studente {
    private String nome;
    private String cognome;
    private String classe;

    private Studente next;

    private ListaVoti voti;

    @Override
    public String toString() {
        return nome + " " + cognome + " " + classe + "\n" + "Voti:\n" + voti.visualizza();
    }



    public Studente(String nome, String cognome, String classe) {
        this.nome = nome;
        this.cognome = cognome;
        this.classe = classe;
        this.voti = new ListaVoti();
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

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Studente getNext() {
        return next;
    }

    public void setNext(Studente next) {
        this.next = next;
    }

    public ListaVoti getVoti() {
        return voti;
    }

    public void setVoti(ListaVoti voti) {
        this.voti = voti;
    }
}
