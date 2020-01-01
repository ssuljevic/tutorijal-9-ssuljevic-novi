package ba.unsa.etf.rpr;

public class Drzava {
    private int id;
    private String naziv;
    private Grad glavni_grad;

    public Drzava(int id, String naziv, Grad glavni_grad) {
        this.id = id;
        this.naziv = naziv;
        this.glavni_grad = glavni_grad;
    }

    public Drzava() {
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

    public Grad getGlavniGrad() {
        return glavni_grad;
    }

    public void setGlavniGrad(Grad glavni_grad) {
        this.glavni_grad = glavni_grad;
    }


}