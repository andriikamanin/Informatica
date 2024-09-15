package Test;

import boundary.Console;
import business.Festival;

public class Test {
    public static void main(String[] args) {
        Festival f = new Festival();
        f.aggiungiInLista("andrii", "fdffdssf", "Ukraine");
        f.aggiungiInLista("andrii", "kamanin", "Ukraine");

        System.out.println(f.visualizzaLista());
        System.out.println(f.ricercaPerCognome("kamanin"));
    }
}
