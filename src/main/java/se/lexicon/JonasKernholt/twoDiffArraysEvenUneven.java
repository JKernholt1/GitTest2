package se.lexicon.JonasKernholt;

import java.util.Arrays;


public class twoDiffArraysEvenUneven {

    public static void main(String[] args) {
        System.out.println("This program will first create 2 different sized arrays with some numbers.");
        System.out.println("It will then add the first array's numbers to the second array's and sort them.");
        System.out.println("After it has sorted the numbers in it, it will place the numbers in a new array.");
        System.out.println("It will place all the odd numbers in the new array's left part and the even ones in its right part.");

        String ettan[] = {"23","19","28","25","30","27","128","64","20","44"};
        String tvaan[] = {"24","88","14","12","55"};

        ettan = arrayConcat(ettan, tvaan);


      //  int fyran[] = new int[15];






     /*
      for (int j = 0; j < 5; j++) {
          int k = 10+j;
          trean[k] = tvaan[j];

      }
*/


        for (int l = 0; l < 15; l++) {
            System.out.print(ettan + "\t");
            if (l == 10) {
                System.out.println();
            }else {}
        }

    }//main


        public static String[] arrayConcat (String[] ettan, String[] tvaan) {
            String[] combined = Arrays.copyOf(ettan, ettan.length + tvaan.length);

            for(int i = ettan.length, j=0; i < combined.length; i++, j++) {
                combined[i] = tvaan[j];
            }
            return combined;
        }









}//class
