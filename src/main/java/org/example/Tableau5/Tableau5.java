package org.example.Tableau5;

import java.util.Random;

public class Tableau5 {

    public static void arrayOfRandom() {
        int[] tab;
        tab = new int[10];

        for (int i = 0; i < 10; i++) {
            //System.out.println(i);
            Random rand = new Random();
            tab[i] = rand.nextInt(100) + 1;
            System.out.print(tab[i] + " ");
        }

    }

}
