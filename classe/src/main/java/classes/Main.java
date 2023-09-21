package classes;

import java.util.Scanner;

import main.java.classes.Rectangle;
import main.java.classes.Utilisateur;
import main.java.classes.Voiture;
import main.java.classes.Carre;

public class Main {
    public static void main(String[] args) {
        // createVoiture();
        createRectangle();
        // createUtilisateur();
    }

    public static void createVoiture() {
        Voiture maVoiture = new Voiture("Rouge", 250);
        System.out.println("Couleur: " + maVoiture.getCouleur());
        System.out.println("Puissance: " + maVoiture.getPuissance() + " cv");
        maVoiture.avancer();
        maVoiture.reculer();
    }

    public static void createRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la largeur du rectangle : ");
        int largeur = scanner.nextInt();
        System.out.print("Entrez la longueur du rectangle : ");
        int longueur = scanner.nextInt();
        if (largeur == longueur) {
            Carre monCarre = new Carre(largeur);
            System.out.println("Vous avez créé un carré!");
            System.out.println("Côté: " + monCarre.getLargeur());
            System.out.println("Surface: " + monCarre.calculerSurface());
            System.out.println("Périmètre: " + monCarre.calculerPerimetre());
        } else {
            Rectangle monRectangle = new Rectangle(longueur, largeur);
            System.out.println("Vous avez créé un rectangle!");
            System.out.println("Longueur: " + monRectangle.getLongueur());
            System.out.println("Largeur: " + monRectangle.getLargeur());
            System.out.println("Surface: " + monRectangle.calculerSurface());
            System.out.println("Périmètre: " + monRectangle.calculerPerimetre());
        }
    }

    public static void createUtilisateur() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le nom : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prénom : ");
        String prenom = scanner.nextLine();
        System.out.print("Entrez l'email : ");
        String email = scanner.nextLine();
        System.out.print("Entrez le mot de passe : ");
        String motDePasse = scanner.nextLine(); // Dans la vraie vie, assurez-vous que c'est sécurisé!

        Utilisateur utilisateur = new Utilisateur(nom, prenom, email, motDePasse);

        System.out.println(utilisateur); // Affiche les détails de l'utilisateur grâce à la méthode toString()
    }
}