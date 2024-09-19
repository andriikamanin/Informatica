package bean;

public class ListaStudenti {
    private Studente head;
    public ListaStudenti() {
        head = null;
    }

    public void aggiungi(String nome, String cognome, String classe){
        Studente nuovoStudente = new Studente(nome, cognome, classe);
        if (isEmpty()) {
            head = nuovoStudente;
        }else{
            Studente current = head;
            while(current.getNext() != null){
                current = current.getNext();
            }

            current.setNext(nuovoStudente);
        }
    }

    public String aggiungiVoto(String nome, String cognome, String materia, int voto) {
        Studente studente = trovaStudente(nome, cognome);
        if (studente != null) {
            studente.getVoti().aggiungi(materia, voto);
            return "Voto: " + voto + " per materia " + materia + " aggiunto.\n";
        } else {
            return "Studente non trovato.";
        }
    }

    // Метод для поиска студента
    public Studente trovaStudente(String nome, String cognome) {
        Studente current = head;
        while (current != null) {
            if (current.getNome().equals(nome) && current.getCognome().equals(cognome)) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }




    public String visualizza(){
        StringBuilder sb = new StringBuilder();
        Studente current = head;
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
