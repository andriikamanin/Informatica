package bean;

public class ListaRegioni {
    private Nodo<Regione> head;

    public void add(Regione regione) {
        Nodo<Regione> newNode = new Nodo<>(regione);
        if (head == null) {
            head = newNode;
        } else {
            Nodo<Regione> current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public Regione find(String nome) {
        Nodo<Regione> current = head;
        while (current != null) {
            if (current.getData().getNome().equals(nome)) {
                return current.getData();
            }
            current = current.getNext();
        }
        return null;
    }

    public void sort() {
        if (head == null || head.getNext() == null) return;

        boolean swapped;
        do {
            swapped = false;
            Nodo<Regione> current = head;
            while (current.getNext() != null) {
                if (current.getData().getNome().compareTo(current.getNext().getData().getNome()) > 0) {
                    Regione temp = current.getData();
                    current.setData(current.getNext().getData());
                    current.getNext().setData(temp);
                    swapped = true;
                }
                current = current.getNext();
            }
        } while (swapped);
    }

    public String print() {
        StringBuilder elenco = new StringBuilder();
        Nodo<Regione> current = head;
        while (current != null) {

            elenco.append("Regione: ").append(current.getData().getNome()).append("\n")
                    .append(current.getData().getProvince().print());
            current = current.getNext();
        }
        System.out.println(elenco + "LOKL");
        return elenco.toString();
    }
}
