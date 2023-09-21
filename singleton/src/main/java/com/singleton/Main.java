package com.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println("Instance 1 hash: " + System.identityHashCode(instance1));
        System.out.println("Instance 2 hash: " + System.identityHashCode(instance2));

        if (instance1 == instance2) {
            System.out.println("Les deux objets sont identiques !");
        } else {
            System.out.println("Les deux objets sont différents.");
        }
    }
}