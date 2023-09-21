package com.singleton;

public class Singleton {

    // Instance unique de la classe Singleton
    private static Singleton uniqueInstance;

    // Constructeur privé pour empêcher la création d'instances depuis d'autres
    // classes
    private Singleton() {
    }

    // Méthode pour obtenir l'unique instance de la classe
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // Autres méthodes de la classe...
}
