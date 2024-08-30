package bean;

public class ListaProvince {
    private Provincia head;

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

    public void sortProvince(){
        if(head == null){
            return;
        }

        boolean swapped;
        Provincia current;
        Provincia ultimo = null;
        do{
            swapped = false;
            current = head;
            while(current.getNext() != null){
                if(current.getNome().compareTo(current.getNext().getNome()) >0){
                    String temp = current.getNome();
                    current.setNome(current.getNext().getNome());
                    current.getNext().setNome(temp);

                    swapped = true;
                }
                current = current.getNext();
            }
            ultimo = current;

        }while(swapped);
    }
}
