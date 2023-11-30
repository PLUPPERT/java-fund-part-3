package org.pluppert.arrays;

import java.util.Arrays;
import java.util.Random;

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
        /*
        int[] array = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        removeDuplicates(array);
        */

        // Exercise 9:
        /*
        String[] nameArray = {"Korv", "Kex-Olof", "Bruttan", "Wawaweewa"};
        addName("Burk-Berta", nameArray);
        */

        // Exercise 10:
        /*
        int[][] multiplicationTable = new int[10][10];
        showMultiplicationTable(multiplicationTable);
        */

        // Exercise 11:
        /*
        intArrayBuilder();
        */

        // Exercise 12:
        /*
        printDiagonalOfArray();
        */

        // Exercise 13:
        sortByEvenAndUneven();
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
    /*
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
    */

    // Exercise 9:
    /*
    private static void addName(String name, String[] nameArray) {
        Arrays.sort(nameArray, String.CASE_INSENSITIVE_ORDER);
        System.out.println("nameArray before new name added:");
        System.out.println(Arrays.toString(nameArray));
        System.out.println();
        System.out.println("nameArray after adding \"" + name + "\":");
        String[] newNameArray = Arrays.copyOf(nameArray, nameArray.length + 1);
        newNameArray[newNameArray.length - 1] = name;
        Arrays.sort(newNameArray, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(newNameArray));
    }
    */

    // Exercise 10:
    /*
    private static void showMultiplicationTable(int[][] multiplicationTable) {
        String format = "%-6s";
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable.length; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }
        for(int[] row : multiplicationTable) {
            for (int num : row) {
                System.out.format(format, num);
            }
            System.out.println();
        }
    }
    */

    // Exercise 11:
    /*
    private static void intArrayBuilder() {
        Scanner inputScanner = new Scanner(System.in);
        int[] intArray = new int[0];
        boolean keepLooping = true;
        int arrayLength = 0;
        int newInt;

        System.out.println("""
                Build an array of integers by adding numbers.
                You'll keep on adding numbers until you add the number '84'.
                Then your array of integers will be complete.
                """);
        System.out.print("Add integer > ");
        while (keepLooping) {
            if (arrayLength != 0) {
                System.out.println("(Remember that the number '84' stops the process)");
                System.out.println("Add next integer > ");
            }
            newInt = inputScanner.nextInt();
            arrayLength++;
            if (newInt == 84) {
                keepLooping = false;
            }
            intArray = Arrays.copyOf(addInt(newInt, intArray), arrayLength);
        }
        System.out.println("You've added '84' to the array and the array is thus completed!");
        System.out.println("Here's the result:");
        System.out.println("Your Integer Array -> " + Arrays.toString(intArray));
    }
    */
    // Exercise 11:
    /*
    private static int[] addInt(int num, int[] intArray) {
        Arrays.sort(intArray);

        int[] newIntArray = Arrays.copyOf(intArray, intArray.length + 1);
        newIntArray[newIntArray.length - 1] = num;
        Arrays.sort(newIntArray);

        return newIntArray;
    }
    */

    // Exercise 12:
    /*
    static void printDiagonalOfArray() {
        int[][] intArray = {
                {1, 2, 3},
                {2, 4, 6},
                {3, 6, 8}
        };

        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i][i] + " ");
        }
    }
    */

    // Exercise 13:
    static void sortByEvenAndUneven() {
        int[] intArrayRandom = new int[5];
        int[] intArrayOrdered = new int[5];
        int[] evenInts = {};
        int[] unevenInts = {};
        boolean hasUnevenInts = false;
        boolean hasEvenInts = false;

        Random randNum = new Random();
        int counterEven = 0;
        int counterUneven = 0;

        for (int i = 0; i < intArrayRandom.length; i++) {
            intArrayRandom[i] = randNum.nextInt();
            if (evenInt(intArrayRandom[i])) {
                hasEvenInts = true;
                counterEven++;
            } else {
                hasUnevenInts = true;
                counterUneven++;
            }
        }

        System.out.println();
        System.out.println("This is the unordered Chaos Array");
        System.out.println(Arrays.toString(intArrayRandom));

        if (hasUnevenInts) {
            unevenInts = returnNewArray(intArrayRandom, counterUneven, false);
            if (!hasEvenInts) {
                intArrayOrdered = Arrays.copyOf(unevenInts, unevenInts.length);
            }
        }

        if (hasEvenInts) {
            evenInts = returnNewArray(intArrayRandom, counterEven, true);
            if (!hasUnevenInts) {
                intArrayOrdered = Arrays.copyOf(evenInts, evenInts.length);
            }
        }

        if (hasUnevenInts && hasEvenInts) {
            int evenCounter = 0;
            System.arraycopy(unevenInts, 0, intArrayOrdered, 0, unevenInts.length);
            for (int i = unevenInts.length; i < intArrayOrdered.length ; i++) {
                intArrayOrdered[i] = evenInts[evenCounter];
                evenCounter++;
            }
        }

        System.out.println();
        System.out.println("Behold the ordered Heavenly Array: ");
        System.out.println(Arrays.toString(intArrayOrdered));
    }

    static boolean evenInt(int numInt) {
        return (numInt % 2) == 0;
    }

    static int[] returnNewArray(int[] array, int arrayLength, boolean returnEvenInts) {
        int[] newArray = new int[arrayLength];
        int counter = 0;

        if (!returnEvenInts) {
            for (int i = 0; i < array.length; i++) {
                if (!evenInt(array[i])) {
                    newArray[counter] = array[i];
                    counter++;
                }
            }
            Arrays.sort(newArray);
        } else {
            for (int i = 0; i < array.length; i++) {
                if (evenInt(array[i])) {
                    newArray[counter] = array[i];
                    counter++;
                }
            }
            Arrays.sort(newArray);
        }
        return newArray;
    }
}
