package se.lexicon.JonasKernholt;
import java.util.Scanner;

public class arrayNumbers {

    public static void main(String[] args) {
        System.out.println("This is an array program that stores numbers in an array. You enter the numbers and...");
        System.out.println("It will then print them out again for you. Letters will make it crash.");
        System.out.println("So... How many numbers would you like to store in the array?");
        Scanner picker = new Scanner(System.in);
        Scanner stuffer = new Scanner(System.in);
        int howManyNs;
        int rackEmUp;

        howManyNs = picker.nextInt();

        System.out.println("\nAlright, you want to type in " + howManyNs + " numbers.");
        System.out.println("Start typing in your numbers one at a time: ");
        int loadsOnumbers[] = new int[howManyNs];

        for  (int i =0; i < howManyNs; i ++) {
            rackEmUp = stuffer.nextInt();
            loadsOnumbers[i] = rackEmUp;
        }

        System.out.println("\nHere are the numbers you typed into the array:");
        for (int j = 0; j < howManyNs; j++) {
                System.out.print(loadsOnumbers[j] + "  ");
            }
        System.out.println("\n\nThis Program has now self imploded...  xDD");
        System.exit(1);
    }//main

} //class
