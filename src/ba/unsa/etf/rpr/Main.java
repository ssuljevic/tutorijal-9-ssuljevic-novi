package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void glavniGrad() {
        GeografijaDAO dao = GeografijaDAO.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite naziv grada: ");
        String naziv = sc.nextLine();
        Grad grad = dao.glavniGrad(naziv);
        if (grad == null) {
            System.out.println("Nepostojuća država");
        } else {
            System.out.println("Glavni grad države " + naziv + " je " + grad.getNaziv());
        }
    }
    public static String ispisiGradove() {
        GeografijaDAO dao = GeografijaDAO.getInstance();
        ArrayList<Grad> gradovi = dao.gradovi();
        String rezultat = "";
        for (Grad grad : dao.gradovi()) {
            rezultat += grad.getNaziv() + " (" + grad.getDrzava().getNaziv() + ") - " + grad.getBrojStanovnika() + "\n";
        }
        return rezultat;
    }



    public static void main(String[] args) {
        System.out.println("Gradovi su:\n" + ispisiGradove());
        glavniGrad();
    }
}