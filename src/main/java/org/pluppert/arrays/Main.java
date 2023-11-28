package org.pluppert.arrays;

import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Exercise 1:
        /*
        int[] array = {11, 23, 39, 12, 103, 79, 84};

        System.out.println("Numbers in array of int values:");
        for(int number : array) {
            System.out.print(number + " ");
        }
        */

        // Exercise 2:
        /*
        System.out.println("Index position of number" + " 12 -> " + indexOf(array, array[3]));
        */

        // Exercise 3:
        /*
        String[] array = new String[]{"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);
        for (String city : array) {
            System.out.println("city = " + city);
        }
        */

        // Exercise 4:
        int[] array1 = {1, 15, 20};
        int[] array2 = Arrays.copyOf(array1, array1.length);
        System.out.print("array1: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("array2: ");
        System.out.println(Arrays.toString(array2));
    }

    // Exercise 2:
    /*
    static int indexOf(int[] array, int elementOfInt) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementOfInt) {
                return i;
            }
        }
        return -1;
    }
    */
}
