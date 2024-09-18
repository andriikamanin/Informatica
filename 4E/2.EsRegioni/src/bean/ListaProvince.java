package bean;

import java.util.List;

public class ListaProvince {
    private Nodo<Provincia> head;

    public void creaLista(List<String> elenco) {
        for (String s : elenco) {
            String[] parti = s.split("-");
            if (parti.length == 2) {
                String nomeProvincia = parti[1].trim();
                String codiceProvincia = parti[0].trim();
                aggiungiProvincia(codiceProvincia, nomeProvincia);
            }
        }
    }

    public void add(Provincia provincia) {
        Nodo<Provincia> newNode = new Nodo<>(provincia);
        if (head == null) {
            head = newNode;
        } else {
            Nodo<Provincia> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void aggiungiProvincia(String codice, String nome) {
        add(new Provincia(codice, nome));
    }

    public void sort() {
        if (head == null || head.getNext() == null) return;

        boolean swapped;
        do {
            swapped = false;
            Nodo<Provincia> current = head;
            while (current.getNext() != null) {
                if (current.getData().getNome().compareTo(current.getNext().getData().getNome()) > 0) {
                    Provincia temp = current.getData();
                    current.setData(current.getNext().getData());
                    current.getNext().setData(temp);
                    swapped = true;
                }
                current = current.getNext();
            }
        } while (swapped);
    }

    public String print() {
        StringBuilder elencoProvince = new StringBuilder();
        Nodo<Provincia> current = head;
        while (current != null) {
            elencoProvince.append("- ").append(current.getData().getNome()).append("\n");
            current = current.getNext();
        }
        return elencoProvince.toString();
    }
}



