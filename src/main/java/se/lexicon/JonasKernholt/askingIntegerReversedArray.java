package se.lexicon.JonasKernholt;
import java.util.Arrays;
import java.util.Scanner;

public class askingIntegerReversedArray {
    public static void main(String[] args) {
        System.out.println("This program asks you about a number that you will type into an array.");
        System.out.println("If you type in -1, the program will first print out all the numbers you just typed in,");
        System.out.println("then print them out in a reversed order from a new array where they have been stored in that order.");
        System.out.println("The program will then end. Now, which is your first number?");
        Scanner reader = new Scanner(System.in);
        int first[] = new int[1000];
        int second[];

        int one;
        int two = 0;
        int three = 0;

        for (int i = 0; two != -1; i++) {
            one = reader.nextInt();
           two = one;

           if (two != -1) {

               first[i] = two;
               three++;
            } else break;


        }//for1

        second = Arrays.copyOf(first, three);

        System.out.println("Here are the numbers you typed in in normal order: ");
        for (int j = 0; j < three ; j++) {
            System.out.print(second[j] + "\t");
        }

        int third[] = new int[three];
        int four;
        int l = 0;

        for (int k = three -1; k >= 0 ; k--){

        four = second[k];
        third[l] = four;
        l++;
        }//for2

        System.out.println("\n\nHere are the numbers you typed in in reversed order: ");

        for (int j = 0; j < three ; j++) {
            System.out.print(third[j] + "\t");
        }

        System.out.println("\nEnd of program.");


    }//main
}//class
