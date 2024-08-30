package bean;

public class ListaRegioni {
    private Regione headRegione;

    public ListaRegioni() {
        headRegione = null;
    }

    public Regione getHeadRegione() {
        return headRegione;
    }

    public void setHeadRegione(Regione headRegione) {
        this.headRegione = headRegione;
    }

    // Method to add a province to a specific region
    public void aggiungiProvincia(String abbreviazione, String nome, String regione) {
        Regione currentRegione = headRegione;
        while (currentRegione != null) {
            if (currentRegione.getNome().equals(regione)) {
                Provincia nuovaProvincia = new Provincia(abbreviazione, nome, regione);
                addProvinceToRegion(currentRegione, nuovaProvincia);
                return; // Exit once the province has been added
            }
            currentRegione = currentRegione.getNext();
        }
        System.out.println("Regione non trovata: " + regione);
    }

    // Helper method to add a province to a region's list
    private void addProvinceToRegion(Regione regione, Provincia nuovaProvincia) {
        Provincia headProvince = regione.getHeadProvince();
        if (headProvince == null) {
            regione.setHeadProvince(nuovaProvincia);
        } else {
            Provincia currentProvince = headProvince;
            while (currentProvince.getNext() != null) {
                currentProvince = currentProvince.getNext();
            }
            currentProvince.setNext(nuovaProvincia);
        }
    }

    // Method to add a region to the list in sorted order
    public void addRegione(Regione newRegione) {
        if (headRegione == null || headRegione.getNome().compareTo(newRegione.getNome()) > 0) {
            newRegione.setNext(headRegione);
            headRegione = newRegione;
        } else {
            Regione current = headRegione;
            while (current.getNext() != null && current.getNext().getNome().compareTo(newRegione.getNome()) < 0) {
                current = current.getNext();
            }
            newRegione.setNext(current.getNext());
            current.setNext(newRegione);
        }
    }

    // Display regions and provinces
    public void visualizzaLista() {
        Regione currentRegione = headRegione;
        while (currentRegione != null) {
            System.out.println(currentRegione.getNome());
            displayProvinces(currentRegione.getHeadProvince(), 4);
            currentRegione = currentRegione.getNext();
        }
        System.out.println("LOOLL");


    }

    // Helper method to display provinces with indentation
    private void displayProvinces(Provincia headProvince, int indent) {
        Provincia currentProvince = headProvince;
        while (currentProvince != null) {
            System.out.println(" ".repeat(indent) + currentProvince);
            currentProvince = currentProvince.getNext();
        }
    }
}
