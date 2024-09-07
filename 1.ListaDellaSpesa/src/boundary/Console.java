package boundary;

import business.ListaDellaSpesa;

import java.util.Scanner;

public class Console {
    private Scanner scanner;
    private ListaDellaSpesa listaDellaSpesa;
    public Console(){
        scanner = new Scanner(System.in);
        listaDellaSpesa = new ListaDellaSpesa();
    }

    public void start(){
        aggiungiProdotto();
        outputProdotti();
    }

    public void aggiungiProdotto(){
        System.out.println("Inserisci nome del prodotto: ");
        String nome = scanner.nextLine();

        System.out.println("Inserisci preso del prodotto: ");
        String prodotto = scanner.nextLine();

        System.out.println("Inserisci mercato del prodotto: ");
        String mercato = scanner.nextLine();

        listaDellaSpesa.aggiungiProdotto(nome, prodotto, mercato);
    }

    public void outputProdotti(){
        String elencoProdotti = listaDellaSpesa.visualizzaPila();
        System.out.println(elencoProdotti);
    }
}
