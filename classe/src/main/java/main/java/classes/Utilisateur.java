package main.java.classes;

public class Utilisateur {
    // Attributs
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse; // Mot de passe stocké en clair pour + de sécu évidemment

    // Constructeur
    public Utilisateur(String nom, String prenom, String email, String motDePasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    // Méthodes supplémentaires
    public String getNomComplet() {
        return prenom + " " + nom;
    }

    public boolean verifierMotDePasse(String motDePasse) {
        return this.motDePasse.equals(motDePasse);
    }

    @Override
    public String toString() {
        return "Utilisateur: " + getNomComplet() + ", Email: " + email;
    }
}
