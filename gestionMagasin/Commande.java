/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author rayan
 */
package gestionMagasin;

import java.util.List;

public class Commande {

    private int idCommande;
    private Client client;
    private List<Produit> produitsCommandes;
    private double total;

    public Commande(int idCommande, Client client, Panier panier) {
        this.idCommande = idCommande;
        this.client = client;
        
        this.produitsCommandes = List.copyOf(panier.getProduits()); 
        this.total = panier.calculerTotal();
    }

    public void afficherDetailsCommande() {
        System.out.println("--- Détails Commande ---");
        System.out.println("ID Commande: " + this.idCommande);
        System.out.println("--- Client ---");
        this.client.afficherDetails();
        System.out.println("--- Produits Commandés ---");
        if (produitsCommandes.isEmpty()) {
            System.out.println("Aucun produit dans cette commande.");
        } else {
            for (Produit p : produitsCommandes) {
                
                System.out.println("- " + p.getNom() + " (" + p.getPrix() + " €)");
            }
        }
        System.out.println("--------------------------");
        System.out.println("Total de la commande: " + this.total + " €");
        System.out.println("--------------------------");
    }

    
    public int getIdCommande() {
        return idCommande;
    }

    public Client getClient() {
        return client;
    }

    public List<Produit> getProduitsCommandes() {
        return produitsCommandes;
    }

    public double getTotal() {
        return total;
    }
}