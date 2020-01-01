package ba.unsa.etf.rpr;

public class Grad {
    private int id;
    private String naziv;
    private int broj_stanovnika;
    private Drzava drzava;

    public Grad(int id, String naziv, int broj_stanovnika, Drzava drzava) {
        this.id = id;
        this.naziv = naziv;
        this.broj_stanovnika = broj_stanovnika;
        this.drzava = drzava;
    }

    public Grad() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStanovnika() {
        return broj_stanovnika;
    }

    public void setBrojStanovnika(int broj_stanovnika) {
        this.broj_stanovnika = broj_stanovnika;
    }

    public Drzava getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzava drzava) {
        this.drzava = drzava;
    }

}
