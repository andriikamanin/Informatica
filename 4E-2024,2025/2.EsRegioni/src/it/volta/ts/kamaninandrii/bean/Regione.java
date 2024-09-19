package it.volta.ts.kamaninandrii.bean;

public class Regione {
    private String nome;

    private Regione next;

    private ListaProvince listaProvince;

    public Regione(String nome) {
        this.nome = nome;

        this.listaProvince = new ListaProvince();
    }


    @Override
    public String toString() {
        return nome + "\n Province:\n" + listaProvince.visualizza();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Regione getNext() {
        return next;
    }

    public void setNext(Regione next) {
        this.next = next;
    }

    public ListaProvince getListaProvince() {
        return listaProvince;
    }

    public void setListaProvince(ListaProvince listaProvince) {
        this.listaProvince = listaProvince;
    }
}
