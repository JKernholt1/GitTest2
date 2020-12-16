package se.lexicon.JonasKernholt;
import java.util.Scanner;
import java.util.Arrays;

public class theIndexClassOrSo {



    public static void main(String[] args) {
    System.out.println("This program lets you type in numbers into an array, and then asks you to ask for a single number of them.");
    System.out.println("If the number exists, it will return its original array position, otherwise it will return \"-1\"");
    System.out.println("\nNow, how many numbers would you like to type into the array?");

    indexOf();
    int indexNumber2 = indexOf(indexNumber);

    if (indexNumber2 == -1) {
    System.out.println("\nWrong number... Here's your \"-1\" :)");
    } else {
        System.out.println("\nNumber found at array index position " + indexNumber2);
    }

    System.out.println("\n\nEnd of program.");

}// main


    public static int indexOf(int indexNumber) {

        Scanner picker = new Scanner(System.in);
        Scanner stuffer = new Scanner(System.in);
        Scanner checker = new Scanner(System.in);
        int howManyNs;
        int rackEmUp;
        int comparer;
        int areYouThere;


        howManyNs = picker.nextInt();
        System.out.println("\nYou want to type in " + howManyNs + " numbers into the array.");
        System.out.println("Start typing in your numbers one at a time: ");
        int loadsOnumbers[] = new int[howManyNs];

        for  (int i = 0; i < howManyNs; i ++) {
            rackEmUp = stuffer.nextInt();
            loadsOnumbers[i] = rackEmUp;
        }

        System.out.println("\nNow type in the number you are looking for: ");
        comparer = checker.nextInt();

        int copy[] = Arrays.copyOf(loadsOnumbers, loadsOnumbers.length);
        Arrays.sort(copy);

//--
        areYouThere = Arrays.binarySearch(copy, comparer);

        if (areYouThere < -0.5) {
            System.out.println("Wrong number... Here's your \"-1\" :)");
            indexNumber = -1;
            return indexNumber;
        } else {
            areYouThere = Arrays.binarySearch(loadsOnumbers, comparer);
            if (areYouThere < 0) {
                //   System.out.println("Number found at array index position 0.");
                indexNumber = 0;
                return indexNumber;
            } else {
                //   System.out.println("Number found at array index position " + areYouThere);
                indexNumber = areYouThere;
                return indexNumber;
            } //end of areYouThere strange position "0" -1 to very low minus method output bug fixer (hopefully).
        } //actual array position


    }  //method indexOf()


}  //class
