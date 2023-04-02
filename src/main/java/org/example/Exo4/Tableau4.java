package org.example.Exo4;

import java.util.Arrays;
import java.util.Scanner;

public class Tableau4 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez la taille du tableau : ");
        int size = sc.nextInt();
        int tab[] = new int[size];

        System.out.println("Entrez les éléments du tableau en chiffre : ");
        for (int i = 0; i < tab.length; i++) {
            tab[i] = sc.nextInt();
        }

        boolean pair = true;
        int somme = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] % 2 != 0) {
                pair = false;
            }
        }
        if (!pair) {
            System.out.println("il y a au moins un élément impair");
        } else {
            System.out.println("  les éléments du tableau sont pairs");
        }
    }
}



