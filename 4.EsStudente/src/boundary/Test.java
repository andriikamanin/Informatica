package boundary;

import business.EsStudente;

public class Test {
    public static void main(String[] args) {
        EsStudente st = new EsStudente();
        st.aggiungiStudente("andrii", "kamanin", "4e");
        st.aggiungiVoto("anndrii", "kamanin", "matematica", 7);
        System.out.println(st.visualizzaStudenti());
    }
}
