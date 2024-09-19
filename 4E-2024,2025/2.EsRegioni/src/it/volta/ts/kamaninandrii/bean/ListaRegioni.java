package it.volta.ts.kamaninandrii.bean;

import it.volta.ts.kamaninandrii.util.FileUtil;

import java.util.List;

public class ListaRegioni {
    private Regione head;
    public ListaRegioni() {
        head = null;
    }

    public void creaLista(List<String> lista) {
        for (String s : lista) {
            String[] parti = s.split("\\s+");
            if(parti.length == 3) {
                String abbreviazione = parti[0];
                String nomeProvincia = parti[1];
                String nomeRegione =  parti[2];


                aggiungiProvincia(nomeRegione, nomeProvincia, abbreviazione);
            }

        }



    }

    public void aggiungi(String nome) {
        Regione nuovoRegione = new Regione(nome);
        if (isEmpty()) {
            head = nuovoRegione;
        } else {
            Regione current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(nuovoRegione);
        }
    }

    public void aggiungiProvincia(String nomeRegione, String nomeProvincia, String abbreviazione) {
        Regione regione = trovaProvincia(nomeRegione);
        if (regione == null) {
            regione = new Regione(nomeRegione);
            aggiungi(nomeRegione);
        }
        regione.getListaProvince().aggiungi(nomeProvincia, abbreviazione);
    }

    public Regione trovaProvincia(String nome) {
        Regione current = head;
        while (current != null) {
            if (current.getNome().equals(nome)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public String visualizza() {
        StringBuilder sb = new StringBuilder();
        Regione current = head;
        while (current != null) {
            sb.append(current.toString()).append("\n");
            current = current.getNext();
        }
        return sb.toString();
    }
}
