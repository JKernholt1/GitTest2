package se.lexicon.JonasKernholt;
import java.util.Arrays;


public class averagenNumberArrayClass {

    public static void main(String[] args) {
        System.out.println("This program will type out the average value of an array.");
        System.out.println("The numbers in the array are: 43, 5, 23, 17, 2, 14.");
        int anArray[] = {43, 5, 23, 17, 2, 14};
        float sum = 0;
        float result = 0;

        for (int i = 0; i < 6; i++) {
        sum = anArray[i] + sum;
        }
        result = sum / 6;
        System.out.println("The sum of all the numbers in the array added together and divided by 6 is: " + result);

    }//main
}//class
