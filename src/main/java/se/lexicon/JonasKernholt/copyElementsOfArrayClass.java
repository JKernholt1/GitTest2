package se.lexicon.JonasKernholt;
import java.util.Scanner;
import java.util.Arrays;

public class copyElementsOfArrayClass {

    public static void main(String[] args) {
        System.out.println("This program will copy an array into another array.");
        System.out.println("\nNow, how many elements would you like to type into the first String array?");

        Scanner picker = new Scanner(System.in);
        Scanner stuffer = new Scanner(System.in);
        int howManyNs;
        String rackEmUp;

        howManyNs = picker.nextInt();

        System.out.println("\nAlright, you want to type in " + howManyNs + " elements into the first array.");
        System.out.println("Start typing in your elements one at a time: ");
        String manyNames[] = new String[howManyNs];

        for  (int i =0; i < howManyNs; i ++) {
            rackEmUp = stuffer.nextLine();
            manyNames[i] = rackEmUp;
        }

        System.out.println("\nHere are the elements you typed into the String array:");
        for (int j = 0; j < howManyNs; j++) {
            System.out.print(manyNames[j] + "  ");
        }

        System.out.println("\n\nHere are the elements from the copied String array:");
       String theCopy[] = Arrays.copyOf(manyNames, manyNames.length);
        for (int j = 0; j < howManyNs; j++) {
            System.out.print(theCopy[j] + "  ");
        }
        System.out.println("");


    }
}