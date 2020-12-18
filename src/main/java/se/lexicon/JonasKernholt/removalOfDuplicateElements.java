package se.lexicon.JonasKernholt;
import java.util.Arrays;

public class removalOfDuplicateElements {

    public static void main(String[] args) {
        System.out.println("This program will remove the duplicate elements of an array of length 10.");
        System.out.println("The elements in the array are: 20, 20, 40, 20, 30, 40, 50, 60, 50");
        String sArrayen[] = {"20", "20", "40", "20", "30", "40", "50", "60", "50"};
        System.out.printf("\n\nHere's the whole array printed out for you: ");

        for (int i = 0; i < sArrayen.length; i++) {
                        System.out.print(sArrayen[i] + "  ");
        }

        System.out.printf("\n\nHere's the same array without duplicate elements: ");
        Arrays.sort(sArrayen);

        for (int i = 0; i < sArrayen.length; i++) {
            if (i > 0 && sArrayen[i] == sArrayen[i-1]) {
                sArrayen[i-1] = "";

            } else continue;

        }// for1
        Arrays.sort(sArrayen);

        for (int j = 0; j < sArrayen.length; j++) {
            if (sArrayen[j] == "") {
                continue;

            } else {
                System.out.printf(sArrayen[j] + "  ");
            }


        }//for2

        System.out.println();

    }//main


}//class
