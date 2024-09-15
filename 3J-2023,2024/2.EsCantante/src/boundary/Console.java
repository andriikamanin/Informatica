package boundary;

import business.Festival;

import java.util.Scanner;

public class Console{
    private Scanner scanner;
    private CaricaDalFile caricaDalFIle;
    private Festival festival;

    public Console(){
        scanner = new Scanner(System.in);
        caricaDalFIle = new CaricaDalFile();
        festival = new Festival();
    }
    //CaricaDalFile
    public void caricaDalFile(){
        festival.creaLista(caricaDalFIle.carica());
    }



    public void start(){
        boolean running = true;
        while(running){
            menu();
            String scelta = scanner.nextLine();
            menuDiImplementazione(scelta);
        }
        caricaDalFile();
        visualizzaLista();
    }

    private void menu() {
        System.out.println("Benvenuti nel meni di gestione di un festival.");
        System.out.println("Scegli tra quelli proposti:");
        System.out.println("Implementazione tramite lista         1");
        System.out.println("Implementazione tramite pila          2");
        System.out.print("Tua scelta: ");
    }

    private void menuDiImplementazione(String sc) {
        int scelta = Integer.parseInt(sc);
        switch (scelta){
            case 1:
                implementazioneMedianteLista();
                break;
            case 2:
                implementazioneMediantePila();
                break;
        }
    }


    //Pila
    private void implementazioneMediantePila() {
    }






    //Lista
    private void menuAzioniConLista(){
        System.out.println("Implementazione tramite lista");
        System.out.println("Scegli un azione:");
        System.out.println("Aggiungi un cantante             1");
        System.out.println("Visualizza tutti cantanti        2");
        System.out.println("Ricerca per cognome              3");
        System.out.println("Tua scelta: ");
    }

    private void implementazioneMedianteLista() {
        boolean exit = false;
        while(!exit){
            menuAzioniConLista();
            String scelta = scanner.nextLine();
            azioneConLista(scelta);
        }

    }

    private void azioneConLista(String sc){
        int scelta = Integer.parseInt(sc);
        switch (scelta){
            case 1:
                aggiungiInLista();
                break;

            case 2:
                visualizzaLista();
                break;
            case 3:
                ricercaPerCognome();
                break;
        }
    }

    private void ricercaPerCognome() {
        System.out.println("Menu di ricerca per cognome");
        System.out.print("Inserisci cognome: ");
        String cognome = scanner.nextLine();
        String risultato = festival.ricercaPerCognome(cognome);
        System.out.println(risultato);
    }

    public void visualizzaLista(){
        System.out.println("Lista cantanti");
        String listaCantanti = festival.visualizzaLista();
        System.out.println(listaCantanti);
    }

    private void aggiungiInLista() {
        System.out.println("Menu di inserimento nuovo cantante");
        System.out.print("Inserisci nome: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci cognome: ");
        String cognome = scanner.nextLine();
        System.out.print("Inserisci paese: ");
        String paese = scanner.nextLine();
        festival.aggiungiInLista(nome, cognome, paese);
    }


}
