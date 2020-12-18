package se.lexicon.JonasKernholt;
import java.util.Arrays;


public class addArrayLengthMethod {

    public static void main(String[] args) {
        System.out.println("Here's a way to make an array longer.");
        System.out.println("The numbers stored in the primary array are:\n");
        int ettan[] = {1, 2, 3, 4};

        for (int i = 0; i < ettan.length; i++) {
            System.out.print(ettan[i] + "  ");
        }
        System.out.println("\n\nAfter using the function to add the values 5 and 6 to the array the array becomes: ");

        int[] tvaan = Arrays.copyOf(ettan , ettan.length + 2);
        tvaan[4] = 5;
        tvaan[5] = 6;

        System.out.println();
        for(int number : tvaan) {
            System.out.print(number+"  ");
        }

    }//main


}//class