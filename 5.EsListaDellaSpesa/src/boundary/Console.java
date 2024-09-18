package boundary;

import listaDellaSpesa.ListaDellaSpesa;

public class Console {
    private CaricaDalFile caricaDalFile;
    private SalvaSulFile salvaSulFile;
    private ListaDellaSpesa listaDellaSpesa;
    public Console() {
        caricaDalFile = new CaricaDalFile();
        salvaSulFile = new SalvaSulFile();
        listaDellaSpesa = new ListaDellaSpesa();
    }

    public void start(){
        caricaDalFile();
        caricaSulFile();
    }

    public void caricaDalFile() {
        listaDellaSpesa.creaElenco(caricaDalFile.carica());
    }

    public void caricaSulFile() {
        salvaSulFile.creaElenco(outputLista());
    }

    public String[] outputLista(){
        String lista = listaDellaSpesa.outputElenco();

        String []listaArray = lista.split("\n");

        return listaArray;
    }
    public void faiLaSpesa(){

    }
}
