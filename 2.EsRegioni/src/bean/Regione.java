package bean;

public class Regione {
    private String nome;
    private ListaProvince province;

    public Regione(String nome) {
        this.nome = nome;
        this.province = new ListaProvince();
    }

    public String getNome() {
        return nome;
    }

    public ListaProvince getProvince() {
        return province;
    }

    public void addProvincia(Provincia provincia) {
        province.add(provincia);
    }
}

