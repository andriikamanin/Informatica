package bean;
import java.util.List;
public class ListaProvince {
    private Provincia head;

    public ListaProvince() {
        head = null;
    }

    public void creaLista(List<String> elenco) {
        for (String s : elenco) {
            // Разбиваем строку на части по запятой
            String[] parti = s.split(" ");
            if (parti.length == 3) {
                String abbreviazione = parti[0].trim();
                String nome = parti[1].trim();
                String regione = parti[2].trim();

                // Добавляем новую провинцию в связанный список
                aggiungiProvincia(abbreviazione, nome, regione);
            }
        }

    }


    public void addTail(Provincia nuovaProvincia) {
        if (head == null) {
            head = nuovaProvincia;
        }else {
            Provincia current = head;
            while (current.getNext() != null) {
                current = current.getNext();

            }
            current.setNext(nuovaProvincia);
        }
    }

    public void aggiungiProvincia(String abbreviazione, String nome, String regione) {
        Provincia nuovaProvincia = new Provincia(abbreviazione, nome, regione);
        addTail(nuovaProvincia);
    }

    public void bubbleSort() {
        if (head == null) {
            return;
        }

        boolean swapped;
        Provincia current;
        Provincia lastSorted = null;

        do {
            swapped = false;
            current = head;

            // Traverse the list up to the lastSorted node
            while (current.getNext() != lastSorted) {
                // Swap nodes if they are in the wrong order
                if (current.getNome().compareTo(current.getNext().getNome()) > 0) {
                    // Swap the names of the nodes
                    String temp = current.getNome();
                    current.setNome(current.getNext().getNome());
                    current.getNext().setNome(temp);

                    swapped = true;
                }
                current = current.getNext();
            }

            // Mark the end of the sorted portion
            lastSorted = current;

        } while (swapped);

        System.out.println("SORTED");
    }

    public String visualizzaLista(){
        String elenco = "";
        Provincia current = head;
        while(current != null){
            elenco += current.toString() + "\n";
            current = current.getNext();
        }


        return elenco;
    }
}
