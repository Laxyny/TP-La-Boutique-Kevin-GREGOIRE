import java.util.ArrayList;
import java.util.List;

public class Boutique {
    private ArrayList<Produit> produits = new ArrayList<>();

    public void addProduit(Produit produit) {
        produits.add(produit);
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void afficherStock() {
        for (Produit produit : getProduits()) {
            produit.afficher();
        }
    }
}
