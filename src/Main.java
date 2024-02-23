import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Boutique laPetiteBoutique = new Boutique();
        Panier panier = new Panier();

        laPetiteBoutique.addProduit(new ProduitElectronique("Telephone", "Un super telephone", 700, 24));
        laPetiteBoutique.addProduit(new ProduitAlimentaire("Orange", "Une bonne orange", 3, LocalDate.of(2024, 03, 01)));
        laPetiteBoutique.addProduit(new ProduitBoisson("Red Bull", "Un soda", 2, 33));

        laPetiteBoutique.afficherStock();

        panier.addProduit(new ProduitElectronique("Telephone", "Un super telephone", 700, 24));
        panier.addProduit(new ProduitAlimentaire("Orange", "Une bonne orange", 3, LocalDate.of(2024, 03, 01)));
        panier.addProduit(new ProduitBoisson("Red Bull", "Un soda", 2, 33));

        System.out.println("Prix total: " + panier.prixTotalPanier() + "€");
    }
}
