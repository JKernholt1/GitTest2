package se.lexicon.JonasKernholt;
import java.util.Arrays;


public class printingUnevenArray {


    public static void main(String[] args) {
        System.out.println("This program will print out the uneven numbers of an array of length 10.");
        System.out.println("The numbers in the array are: 1 2 4 7 9 12 13 15 18 21\n");
        int enArray[] = {1, 2, 4, 7, 9, 12, 13, 15, 18, 21};

        for  (int i = 0; i < 10; i++) {
            if (enArray[i] % 2 == 0){
            continue; } else {
                System.out.print(enArray[i] + " ");
            }
        }

    }//main


}//class
