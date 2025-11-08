/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author DJOUADI Rayane ING1 - BDML1
 */
package gestionMagasin;

import java.util.ArrayList;
import java.util.List;

public class Magasin {

    private List<Produit> produits;

    public Magasin() {
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        this.produits.add(produit);
    }

    public void afficherProduitsDisponibles() {
        System.out.println("--- Produits Disponibles en Magasin ---");
        if (this.produits.isEmpty()) {
            System.out.println("Il n'y a aucun produit dans le magasin.");
        } else {
            for (Produit p : this.produits) {
                p.afficherDetails();
            }
        }
        System.out.println("---------------------------------------");
    }

    public Produit trouverProduitParNom(String nom) {
        for (Produit p : this.produits) {
            if (p.getNom().equalsIgnoreCase(nom)) {
                return p;
            }
        }
        return null;
    }
    
    
    public List<Produit> getProduits() {
        return produits;
    }

}
