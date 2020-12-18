package se.lexicon.JonasKernholt;
import java.util.Arrays;

public class multiplicationOfTwo2dArrays {

    public static void main(String[] args) {
        System.out.println("This program will print out a multiplication table of 1 to 10.");
        System.out.println("The program will use a 2d array for the task.");
        int number1[][] = new int[10][10];
        int two;

         //    = ;
        for  (int i =0; i < 10; i ++) {
            for  (int j =0; j < 10; j ++) {
             two = (i+1)*(j+1);
             number1[i][j] = two;
            }
          }


        for(int i=0;i<10;i++){
           System.out.println();
            for(int j=0;j<10;j++){
                System.out.print(number1[i][j] + "\t");
                 }
            System.out.println();
               }

             System.out.println();

    }//main
}//class
