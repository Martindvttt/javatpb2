package com.javacours;

import java.util.Scanner;
import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        // reverseString();
        // pyramid();
        // sum();
        // checkInt();
        thePriceIsRight();
    }

    public static void reverseString() {
        String str = "kayak", nstr = "";
        char ch;

        System.out.print("Original word: ");
        System.out.println(str); // Example word

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i); // extracts each character
            nstr = ch + nstr; // adds each character in front of the existing string
        }
        System.out.println("Reversed word: " + nstr);
    }

    public static void pyramid() {
        Scanner scanner = new Scanner(System.in); // Scanner is used to listen users entry
        System.out.print("Entrez la hauteur de la pyramide : ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(" "); // Spaces to place the pyramid correctly
            }
            for (int k = 0; k < (2 * i) - 1; k++) {
                System.out.print("^");
            }
            System.out.println();
        }
    }

    public static void sum() {
        int total = 0;
        for (int i = 1; i <= 10000; i++) {
            total += i;
        }
        System.out.print(total);
    }

    public static void checkInt() {
        Scanner scanner = new Scanner(System.in); // Scanner is used to listen users entry
        System.out.print("Entrez un entier : ");
        int toCheck = scanner.nextInt();
        if (toCheck % 2 == 0) {
            System.out.print("Votre entier est pair");
        } else {
            System.out.print("Votre entier est impair");
        }
    }

    public static void thePriceIsRight() {
        Random rand = new Random();
        int random = rand.nextInt(10);
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Devinez le nombre entre 1 et 100000!");
        int guess;
        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.print("Entrez un entier: ");
            guess = scanner.nextInt();
            count++;
            if (guess == random) {
                isCorrect = true;
                System.out.println("Bravo! Vous avez trouvé le bon nombre!");
            } else if (guess > random) {
                System.out.println("C'est moins.");
            } else {
                System.out.println("C'est plus !");
            }
        }
        System.out.println("Vous avez trouvé en " + count + " coups.");
    }
}