package it.volta.ts.kamaninandrii.bean;

public class ListaProvince {
    private Provincia head;


    public ListaProvince() {
        head = null;
    }

    public void aggiungi(String nome, String abbreviazione) {
        Provincia nuovaProvincia = new Provincia(nome, abbreviazione);
        if (isEmpty()) {
            head = nuovaProvincia;
        } else {
            Provincia current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(nuovaProvincia);
        }
    }

    public boolean isEmpty() {
        if (head == null) return true;
        else return false;

    }

    public String visualizza() {
        StringBuilder sb = new StringBuilder();
        Provincia current = head;
        while (current != null) {
            sb.append(current.toString()).append("\n");
            current = current.getNext();
        }
        return sb.toString();
    }

}
