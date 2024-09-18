package bean;

public class Voto {
    private int voto;
    private String materia;

    private Voto next;

    @Override
    public String toString() {
        return "Voto: " + voto + ", materia: " + materia;
    }

    public Voto(String materia, int voto) {
        this.voto = voto;
        this.materia = materia;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Voto getNext() {
        return next;
    }

    public void setNext(Voto next) {
        this.next = next;
    }
}
