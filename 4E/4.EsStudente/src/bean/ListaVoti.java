package bean;

public class ListaVoti {
    private Voto head;
    public ListaVoti() {
        head = null;
    }

    public void aggiungi(String materia, int voto){
        Voto nuovoVoto = new Voto(materia, voto);
        if (isEmpty()) {
            head = nuovoVoto;
        }else{
            Voto current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }

            current.setNext(nuovoVoto);
        }
    }


    public String visualizza(){
        StringBuilder sb = new StringBuilder();
        Voto current = head;
        while(current != null){
            sb.append(current.toString()).append("\n");
            current = current.getNext();
        }

        return sb.toString();
    }

    public boolean isEmpty(){
        if (head == null) return true;
        return false;
    }

}
