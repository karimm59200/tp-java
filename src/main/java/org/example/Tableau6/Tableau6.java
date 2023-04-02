package org.example.Tableau6;

import java.util.Arrays;
import java.util.Random;

public class Tableau6 {

    public static void sommeArrayRandom(){

        int [] tab1, tab2;
        tab1= new int [5];
        tab2 = new int [5];
         int somme1=0;
         int somme2=0;


        for (int i = 0; i < tab1.length; i++) {
            Random rand = new Random();
            tab1[i]=rand.nextInt(100)+1;
            tab2[i]=rand.nextInt(100)+1;
            somme1 += tab1[i];
            somme2 += tab2[i];
            //System.out.print(  " tableau 1 : "+tab1[i] + " ");
//            System.out.print("*******");
         // System.out.print(tab2[i]);

        }
        System.out.println("tableau 1 : "+Arrays.toString(tab1));
        System.out.println("tableau 2 : "+Arrays.toString(tab2));
        System.out.println("la somme des valeurs du tableau 1 est de : " + somme1);
        System.out.println("la somme des valeurs du tableau 2 est de : " + somme2);

    }
}
