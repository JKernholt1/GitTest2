package se.lexicon.JonasKernholt;

import java.util.Scanner;
import java.util.Arrays;

public class a2dStringAssignerClass {

    public static void main(String[] args) {
        System.out.println("This program will create a 2d [2][2] String array to store country and city names in.");
        System.out.println("Start typing in your cities and countries in the 2d String array one at a time: ");

        Scanner stuffer = new Scanner(System.in);
        String rackEmUp;


        String manyNames[][] = new String[2][2];


        for  (int i  =0; i < 2; i ++) {
            for (int j = 0; j < 2; j++) {
                rackEmUp = stuffer.nextLine();
                manyNames[i][j] = rackEmUp;
               }
            }

        System.out.println("\nHere are the countries and cities you typed into the 2d String array:");
          for(int i = 0; i < 2; i++){
                for(int j = 0; j < 2; j++){
                    System.out.print(manyNames[i][j]+" ");
                }
                System.out.println();
            }
    }//main

}//class
