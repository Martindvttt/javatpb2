package com.banque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez votre nom: ");
        String nom = scanner.nextLine();

        System.out.print("Entrez votre prénom: ");
        String prenom = scanner.nextLine();

        System.out.print("Entrez votre ID client: ");
        int idClient = scanner.nextInt();

        // Crée un client avec un solde initial de 1000.0
        Client client = new Client(nom, prenom, idClient, 1000.0);

        while (true) {
            // Menu
            System.out.println("Bonjour, " + client.getNom() + " " + client.getPrenom() + ".");
            System.out.println("1. Afficher le solde");
            System.out.println("2. Effectuer un dépôt");
            System.out.println("3. Effectuer un retrait");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option (1/2/3/4): ");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Solde actuel: " + client.getCompte().getSolde() + "€");
                    break;
                case 2:
                    System.out.print("Montant du dépôt: ");
                    double montantDepot = scanner.nextDouble();
                    client.getCompte().deposer(montantDepot);
                    System.out.println("Dépôt effectué. Nouveau solde: " + client.getCompte().getSolde() + "€");
                    break;
                case 3:
                    System.out.print("Montant du retrait: ");
                    double montantRetrait = scanner.nextDouble();
                    if (client.getCompte().retirer(montantRetrait)) {
                        System.out.println("Retrait effectué. Nouveau solde: " + client.getCompte().getSolde() + "€");
                    } else {
                        System.out.println("Retrait non effectué. Solde insuffisant.");
                    }
                    break;
                case 4:
                    System.out.println("Au revoir, " + client.getNom() + " " + client.getPrenom() + " !");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Option non valide. Veuillez choisir une option entre 1 et 4.");
            }
        }
    }
}
