package org.pluppert.arrays;

import java.sql.Array;
import java.text.DecimalFormat;
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
        /*
        int[] array1 = {1, 15, 20};
        int[] array2 = Arrays.copyOf(array1, array1.length);
        System.out.print("array1: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("array2: ");
        System.out.println(Arrays.toString(array2));
        */

        // Exercise 5:
        /*
        String[][] array = {
                {"France", "Paris"},
                {"Sweden", "Stockholm"}
        };
        System.out.println(array[0][0] + " : " + array[0][1]);
        System.out.println(array[1][0] + " : " + array[1][1]);
        */

        // Exercise 6:
        /*
        int[] array = {43, 5, 23, 17, 2, 14};
        DecimalFormat setFormat = new DecimalFormat("#.0");
        double totalSum = 0;

        for (int number : array) {
            totalSum += number;
        }

        System.out.println("Average is: " + setFormat.format(totalSum / array.length));
        */

        // Exercise 7:
        /*
        int[] array = {1, 2, 4, 7, 9, 12, 8, 69, 154, 13};
        printUnevenNumbers(array);
        */

        // Exercise 8:
        int[] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        removeDuplicates(array);

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

    // Exercise 7:
    /*
    static void printUnevenNumbers(int[] array) {
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Odd Array: ");
        for (int num : array) {
            if ((num%2) != 0) {
                System.out.print(num + " ");
            }
        }
    }
    */

    // Exercise 8:
    private static void removeDuplicates(int[] array) {
        int newLength = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    newLength += 1;
                }
            }
        }

        int[] newArray = new int[newLength];
        int i = 0;

        for (int num : array) {
            if (Arrays.stream(newArray).noneMatch(value -> value == num)) {
                newArray[i] = num;
                i++;
            }
        }

        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Array without duplicate values: ");
        for (int num : newArray) {
            System.out.print(num + " ");
        }
    }
}
