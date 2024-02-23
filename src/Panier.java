import java.util.ArrayList;

public class Panier {
    private ArrayList<Produit> produits = new ArrayList<>();

    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    public int prixTotalPanier() {
        int total = 0;
        for (Produit produit : produits) {
            total += produit.getPrix();
        }
        return total;
   }
}
