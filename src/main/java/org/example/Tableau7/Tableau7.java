package org.example.Tableau7;

import java.util.Arrays;
import java.util.Random;

public class Tableau7 {

    public static void Tableau() {

        int[] tab;
        tab = new int[10];
        int max = 0;

        for (int i = 0; i < tab.length; i++) {
            Random rand = new Random();
            tab[i] = rand.nextInt(100) + 1;

            if (tab[i] > max) {
                max = tab[i];
            }
        }
        System.out.println(" tableau : " + Arrays.toString(tab));
        System.out.println(" la valeur max est de : " + max);
    }
}
