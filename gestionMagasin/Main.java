/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionMagasin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // 1. Création du magasin et des produits initiaux
        Magasin magasin = new Magasin();
        magasin.ajouterProduit(new Produit(1, "Ordinateur", 1200.00, 5));
        magasin.ajouterProduit(new Produit(2, "Clavier", 80.00, 15));
        magasin.ajouterProduit(new Produit(3, "Souris", 30.00, 25));
        magasin.ajouterProduit(new Produit(4, "Ecran 4K", 450.00, 8));

        // 2. Création du client et de son panier
        Client client1 = new Client(101, "Rayane Djouadi", "rayane.djouadi@email.com");
        Panier panier = new Panier();

        // 3. Logique du menu interactif
        Scanner scanner = new Scanner(System.in);
        int choix = 0;
        int idCommandeSuivante = 1;

        while (choix != 5) {
            System.out.println("\n--- Menu Magasin ---"); 
            System.out.println("Client connecté: " + client1.getNom());
            System.out.println("1. Afficher les produits disponibles"); 
            System.out.println("2. Ajouter un produit au panier"); 
            System.out.println("3. Afficher le panier"); 
            System.out.println("4. Passer la commande"); 
            System.out.println("5. Quitter"); 
            System.out.print("Votre choix: ");

            try {
                choix = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erreur: Veuillez entrer un chiffre.");
                choix = 0; 
            }

            switch (choix) {
                case 1:
                    magasin.afficherProduitsDisponibles();
                    break;
                case 2:
                    System.out.print("Entrez le nom du produit à ajouter: ");
                    String nomProduit = scanner.nextLine();
                    Produit produitRecherche = magasin.trouverProduitParNom(nomProduit);
                    if (produitRecherche != null) {
                        panier.ajouterProduit(produitRecherche);
                        System.out.println("'" + produitRecherche.getNom() + "' a été ajouté au panier.");
                    } else {
                        System.out.println("Produit non trouvé.");
                    }
                    break;
                case 3:
                    panier.afficherPanier();
                    break;
                case 4:
                    if (panier.getProduits().isEmpty()) {
                        System.out.println("Votre panier est vide. Impossible de commander.");
                    } else {
                        Commande nouvelleCommande = new Commande(idCommandeSuivante, client1, panier);
                        System.out.println("--- Commande passée avec succès ---");
                        nouvelleCommande.afficherDetailsCommande();
                        
                        // Vider le panier après la commande
                        panier = new Panier();
                        idCommandeSuivante++;
                    }
                    break;
                case 5:
                    System.out.println("Merci de votre visite. Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        }
        
        scanner.close();
    }
}

