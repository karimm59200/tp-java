package org.example.Exo3;

import java.util.Scanner;

public class Tableau3 {


    public static void searchValueInArray() {

        int retour = 0;
        int[] tab = {10, 20, 30, 40, 50, 60, 70, 80};
        boolean check = false;

        System.out.println("Saisir une valeur entre 1 et 80 : ");
        Scanner s = new Scanner(System.in);
        retour = s.nextInt();

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == retour) {
                check = true;
            }

        }

        if (check) {
            System.out.println("l'entier est dans le tableau");
        } else {
            System.out.println("l'entier n'est pas dans le tableau");
        }

    }

}
