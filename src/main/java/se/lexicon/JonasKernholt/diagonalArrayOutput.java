package se.lexicon.JonasKernholt;

public class diagonalArrayOutput {

    public static void main(String[] args) {
        System.out.println("This program will print the diagonal elements of a two-dimensional array.");
        System.out.println("It will first create a 1 to 5 times 1 to 5 2d matrix and print it out.");
        System.out.println("It will then print out its diagonal numbers only.");

       int a2dArray[][] = new int[5][5];
        int two;
        int three = 0;


        for  (int i =0; i < 5; i ++) {
            for  (int j =0; j < 5; j ++) {
                two = (i+1)*(j+1);
                a2dArray[i][j] = two;
            }
        }

        for(int i = 0; i < 5; i++) {
            System.out.println();
            for(int j = 0; j < 5; j++) {
                System.out.print(a2dArray[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nAnd here comes the diagonal numbers:");


        for(int i = 0; i < 5; i++) {
               int j = i;
                System.out.print(a2dArray[i][j] + "\t");
            }

            System.out.println();


    }//main

}//class
