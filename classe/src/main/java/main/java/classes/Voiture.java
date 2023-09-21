package main.java.classes;

public class Voiture {
    private String couleur;
    private int puissance;

    // Constructeur
    public Voiture(String couleur, int puissance) {
        this.couleur = couleur;
        setPuissance(puissance); // Utilisez le setter pour valider la puissance
    }

    // Getter pour couleur
    public String getCouleur() {
        return couleur;
    }

    // Setter pour couleur
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    // Getter pour puissance
    public int getPuissance() {
        return puissance;
    }

    // Setter pour puissance avec validation
    public void setPuissance(int puissance) {
        if (puissance >= 50 && puissance <= 500) {
            this.puissance = puissance;
        } else {
            throw new IllegalArgumentException("La puissance doit être comprise entre 50 et 500 cv.");
        }
    }

    // Méthode pour avancer
    public void avancer() {
        System.out.println("La voiture avance !");
    }

    // Méthode pour reculer
    public void reculer() {
        System.out.println("La voiture recule !");
    }
}
