package bean;

public class PilaCantanti {
    private Cantante head;

    public PilaCantanti() {
        head = null;
    }

    public void push(String nome, String cognome, String paese) {
        if(head == null) {
            head = (new Cantante(nome, cognome, paese));
        }else{
            Cantante aux = new Cantante(nome, cognome, paese);
            aux.setNext(head);
            head = aux;
        }
    }

    public void pop(){
        Cantante aux = head;
        head = head.getNext();
        aux = null;
    }

    public String peek(){
        return head.toString();
    }
}
