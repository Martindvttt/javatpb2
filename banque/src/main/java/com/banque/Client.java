package com.banque;

public class Client {
    private String nom;
    private String prenom;
    private int idClient;
    private Compte compte;

    // Le constructeur
    public Client(String nom, String prenom, int idClient, double soldeInitial) {
        this.nom = nom;
        this.prenom = prenom;
        this.idClient = idClient;
        this.compte = new Compte(soldeInitial); // Crée un compte avec un solde initial attribué a un client.
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getIdClient() {
        return idClient;
    }

    public Compte getCompte() {
        return compte;
    }

}
