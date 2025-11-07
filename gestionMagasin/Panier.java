/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rayan
 */

package gestionMagasin;

import java.util.ArrayList;
import java.util.List;

public class Panier {

    private List<Produit> produits;

    public Panier() {
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
    }

    public void supprimerProduit(Produit produit) {
        this.produits.remove(produit);
    }

    public void afficherPanier() {
        System.out.println("--- Contenu du Panier ---");
        if (produits.isEmpty()) {
            System.out.println("Le panier est vide.");
        } else {
            for (Produit p : produits) {
                
                p.afficherDetails();
            }
            System.out.println("--------------------------");
            System.out.println("Total du panier: " + this.calculerTotal() + " €");
        }
        System.out.println("--------------------------");
    }

    public double calculerTotal() {
        double total = 0.0;
        for (Produit p : produits) {
            total += p.getPrix();
        }
        return total;
    }

    
    public List<Produit> getProduits() {
        return this.produits;
    }
}