package org.pluppert.arrays;

public class Main {
    public static void main(String[] args) {

        // Exercise 1:
        int[] array = {11, 23, 39, 12, 103, 79, 84};
        /*
        System.out.println("Numbers in array of int values:");
        for(int number : array) {
            System.out.print(number + " ");
        }
        */

        // Exercise 2:
        System.out.println("Index position of number" + " 12 -> " + indexOf(array, array[3]));
    }

    // Exercise 2:
    static int indexOf(int[] array, int elementOfInt) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementOfInt) {
                return i;
            }
        }
        return -1;
    }
}
