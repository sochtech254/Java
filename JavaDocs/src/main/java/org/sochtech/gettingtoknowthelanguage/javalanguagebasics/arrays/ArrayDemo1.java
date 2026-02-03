package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.arrays;

public class ArrayDemo1 {
    static void main() {
        // Basic array creation and initialization
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print array elements using a loop
        IO.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            IO.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
