/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

/**
 *
 * @author DJOUADI Rayane ING1 - BDML1
 */


public class Produit {

    private int id; 
    private String nom; 
    private double prix; 
    private int quantite; 
    
    
    public Produit(int id, String nom, double prix, int quantite) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.quantite = quantite;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    
    public void afficherDetails() {
        System.out.println("--- Détails Produit ---");
        System.out.println("ID: " + this.id);
        System.out.println("Nom: " + this.nom);
        System.out.println("Prix: " + this.prix + " €");
        System.out.println("Quantité en stock: " + this.quantite);
    }

}
