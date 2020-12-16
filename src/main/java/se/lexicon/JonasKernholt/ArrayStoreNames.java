package se.lexicon.JonasKernholt;

import java.util.Arrays;


public class ArrayStoreNames {
    // Ctrl + Alt + L
    private static String[] names = new String[0];

    /**
     * Empties the array by overwriting it with a new empty array
     */
    public static void clear() {
        names = new String[0];
    }

    public static boolean nameExists(String fullName) {// method starts
        boolean exists = false;
        for (String name : names) { // for loop starts
            if (name.equalsIgnoreCase(fullName)) { // in statements starts
                exists = true;
                break; // breaks out of a loop or a switch.
            }// if ends
        } // for loop ends

        return exists;
    } // method ends

    public static boolean add(String fullName) {
        // step1 : check variable content
        if (fullName == null) {
            return false;
        }
        if (fullName.equalsIgnoreCase(" ")) {
            return false;
        }
        if (nameExists(fullName)) {
            return false;
        }
        // add variable to array
        names = addStringToArray(names, fullName);
        return true;
    }

    public static String[] findByFirstName(String firstName) {
        // validate input parameter

        String[] result = new String[0];
        for (String fullName : names) {
            // Mehrdad Javan
            String extracted = fullName.substring(0, fullName.indexOf(" "));// Mehrdad
            if (extracted.equalsIgnoreCase(firstName)) {
                result = addStringToArray(result, fullName);
            }
        }
        return result;
    }

    public static String[] findByLastName(String lastName) {
        // validate input parameter

        String[] result = new String[0];
        for (String fullName : names) {
            // Mehrdad Javan
            String extracted = fullName.substring(fullName.indexOf(" "));// Javan
            if (extracted.equalsIgnoreCase(lastName)) {
                result = addStringToArray(result, fullName);
            }
        }
        return result;
    }

    private static String[] addStringToArray(String[] sourceArray, String input) {
        String[] returnArray = Arrays.copyOf(sourceArray, sourceArray.length + 1);// array.length return the size of array or number of elements that exist in array
        returnArray[returnArray.length - 1] = input; //  names[0] = Mehrdad Javan
        return returnArray;
    }

    public static boolean remove(String fullName) {
        // we do not need to check the name exist
        /*if (!nameExists(fullName)) {
            return false;
        }*/
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        int findIndex = Arrays.binarySearch(names, fullName);
        // check name exist in array
        if (findIndex < 0) { // binarySearch returns a negative number, it means that value dose not exist in array
            return false;
        }
        String[] anotherArray = new String[names.length - 1];
        int sequencer = 0;
        for (int i = 0; i < names.length; i++) {
            if (i == findIndex) {
                continue;
            }
            anotherArray[sequencer++] = names[i];
        }
        names = anotherArray;
        return true;
    }


    public static void main(String[] args) {
        System.out.println("Names : ");
        System.out.println(Arrays.toString(names));

        System.out.println("--------------------------");
        String addNames1 = "Mehrdad Javan";
        boolean resultArr1 = add(addNames1);
        System.out.println("resultArr1: " + resultArr1);
        System.out.println("--------------------------");
        System.out.println("Names : ");
        System.out.println(Arrays.toString(names));
        System.out.println("--------------------------");
        String addName2 = "Simon Elbrink";
        boolean resultAddName = add(addName2);
        System.out.println("resultAddName: " + resultAddName);
        System.out.println("--------------------------");
        System.out.println("Names : ");
        System.out.println(Arrays.toString(names));

        System.out.println("--------------------------");
        String name3 = "Simon Elbrink";
        boolean resultAddName3 = add(name3);
        System.out.println("resultAddName3 = " + resultAddName3);
        System.out.println("--------------------------");
        System.out.println("Names : ");
        System.out.println(Arrays.toString(names));
        System.out.println("--------------------------");

        boolean removeResult = remove("Mehrdad Javan");
        System.out.println("removeResult: " + removeResult);
        System.out.println("--------------------------");
        System.out.println("Names : ");
        System.out.println(Arrays.toString(names));


        System.out.println("-----------------------------");
        clear();
        System.out.println("--------------------------");
        System.out.println("Names : ");
        System.out.println(Arrays.toString(names));


    }


}