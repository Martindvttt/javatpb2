package main.java.com.javacours;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors

public class ex2 {
    public static void main(String[] args) {
        // countWords();
        // saveString();
        countFile();
    }

    public static void countWords() {
        Scanner scanner = new Scanner(System.in); // Scanner is used to listen users entry
        System.out.print("Entrez la phrase a compter : ");
        String str = scanner.nextLine();
        final String sep = " ";
        String words[] = str.split(sep);
        System.out.print(words.length);
    }

    public static void saveString() {
        Scanner scanner = new Scanner(System.in); // Scanner is used to listen users entry
        System.out.print("Entrez la phrase a enregistrer : ");
        String str = scanner.nextLine();
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write(str);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void countFile() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Veuillez entrer le chemin du fichier: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        try {
            Scanner fileScanner = new Scanner(file);
            int wordCount = 0;

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }

            fileScanner.close();
            System.out.println("Le fichier contient " + wordCount + " mots.");

        } catch (FileNotFoundException e) {
            System.out.println("Erreur : le fichier n'a pas été trouvé.");
        }
    }
}
