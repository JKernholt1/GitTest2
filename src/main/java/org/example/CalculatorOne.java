package se.lexicon.JonasKernholt;
import java.util.Scanner;

public class CalculatorOne {

    public static void main(String[] args) {
        System.out.println("\nWelcome to Jonas calculator program!");
        System.out.println("\nWould you like to make a calculation?");

        Scanner selector = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);

        int activation;
        int operator;
        float one;
        float two;
        double sum;

        Boolean running = true;

//-----------

        while (running == true) {

            System.out.println("\nType \"1\" for yes, or type any other whole number to shut down the program: ");

//--

            activation = selector.nextInt();

            if (activation == 1) {
                System.out.println("\nWhich type of calculation would you like to make?");
                System.out.println("Please type \"1\" for a \"*\" operation, or ");
                System.out.println("Please type \"2\" for a \"/\" operation, or ");
                System.out.println("Please type \"3\" for a \"+\" operation, or ");
                System.out.println("Please type \"4\" for a \"-\" operation, or ");
                System.out.println("type any other whole number to shut down the program: ");


//--
                operator = selector.nextInt();
//--
                if (operator == 1) {
                    System.out.println("\nPlease enter the first of two not too vast numbers to multiply: ");
                    one = reader.nextFloat();
                    System.out.println("\nPlease enter the second of two not too vast numbers to multiply: ");
                    two = reader.nextFloat();
                    sum = one * two;

                    System.out.println("\nThe result of the multiplication is: " + sum);
                    System.out.println("Would you like to make another calculation?");

                }  //end of '*'

//self note: if 'one' or 'two' are anything else than numbers, the program will most likely crash. Exception handling?
//----
                else if (operator == 2) {
                    System.out.println("\nPlease enter the first of two (not too vast) numbers to divide: ");
                    one = reader.nextFloat();
                    System.out.println("\nPlease enter the second of two (not too vast) numbers to divide: ");
                    two = reader.nextFloat();
                    sum = one / two;

                    System.out.println("\nThe result of the division is: " + sum);
                    System.out.println("Would you like to make another calculation?");

                }  //end of '/'
//----
                else if (operator == 3) {
                    System.out.println("\nPlease enter the first of two (not too vast) numbers to add: ");
                    one = reader.nextFloat();
                    System.out.println("\nPlease enter the second of two (not too vast) numbers to add: ");
                    two = reader.nextFloat();
                    sum = one + two;

                    System.out.printf("\nThe result of the addition is: " + sum);
                    System.out.println("Would you like to make another calculation?");

                }  //end of '+'
//----
                else if (operator == 4) {
                    System.out.println("\nPlease enter the first of two (not too vast) numbers to subtract from: ");
                    one = reader.nextFloat();
                    System.out.println("\nPlease enter the second number that subtracts from the first number: ");
                    two = reader.nextFloat();
                    sum = one - two;

                    System.out.println("\nThe result of the subtraction is: " + sum);
                    System.out.println("Would you like to make another calculation?");

                }  //end of '-'
//----
                else {
                    System.out.println("\n\nJonas calculator program is now shut down.");
                    System.exit(1);
                }  //end of 'if random char(s) outside functional operations are given'

//------



            }  //end of 'if activation 1'
//-----------
            else if (activation != 1) {

                System.out.println("\nThank you for using Jonas calculator program!");
                running = false;
            }  //end of 'operator not 1'

//-----------
        }  //end of 'while'

        System.out.println("\nJonas calculator program is now shut down.");
        System.exit(1);

//-----------


    }  //main
}  //class

