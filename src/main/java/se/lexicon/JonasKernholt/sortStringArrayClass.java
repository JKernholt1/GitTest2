package se.lexicon.JonasKernholt;
import java.util.Scanner;
import java.util.Arrays;

public class sortStringArrayClass {


    public static void main(String[] args) {
        System.out.println("This program will sort a String array with names you type in.");
        System.out.println("\nNow, how many names would you like to type into the String array?");

        Scanner picker = new Scanner(System.in);
        Scanner stuffer = new Scanner(System.in);
        int howManyNs;
        String rackEmUp;

        howManyNs = picker.nextInt();

        System.out.println("\nAlright, you want to type in " + howManyNs + " names.");
        System.out.println("Start typing in your names one at a time: ");
        String manyNames[] = new String[howManyNs];

        for  (int i =0; i < howManyNs; i ++) {
            rackEmUp = stuffer.nextLine();
            manyNames[i] = rackEmUp;
        }

        System.out.println("\nHere are the unsorted names you typed into the String array:");

        for (int j = 0; j < howManyNs; j++) {
            System.out.print(manyNames[j] + "  ");
        }

        System.out.println("\nHere are the now sorted names you typed into the String array:");
        Arrays.sort(manyNames);
        for (int j = 0; j < howManyNs; j++) {
            System.out.print(manyNames[j] + "  ");
        }


        System.out.println("\n\nThis Program is now shut down");
        System.exit(1);

    }//main
}//class
