/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author DJOUADI Rayane ING1 - BDML1
 */
package gestionMagasin;

public class Client {

    private int id;
    private String nom;
    private String email;

    
    public Client(int id, String nom, String email) {
        this.id = id;
        this.nom = nom;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public void afficherDetails() {
        System.out.println("--- Informations Client ---");
        System.out.println("ID Client: " + this.id);
        System.out.println("Nom: " + this.nom);
        System.out.println("Email: " + this.email);
    }

}
