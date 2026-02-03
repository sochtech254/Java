package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.arrays;

import java.util.Arrays;

public class ArrayCalculations {
    static void main() {
        // Array calculations
        int[] values = {12, 8, 15, 3, 9, 21};
        int sum = 0;
        int max = values[0];
        int min = values[0];

        // Calculate sum, max, and min
        for (int value : values) {
            sum += value;
            if (value > max) max = value;
            if (value < min) min = value;
        }

        double average = (double) sum / values.length;

        IO.println("Array: " + Arrays.toString(values));
        IO.println("Sum: " + sum);
        IO.println("Average: " + average);
        IO.println("Maximum: " + max);
        IO.println("Minimum: " + min);

        // Try with different numbers
        int[] moreNumbers = {45, 23, 67, 12, 89, 34};
        int total = 0;
        for (int num : moreNumbers) {
            total += num;
        }

        IO.println("");
        IO.println("Second array: " + Arrays.toString(moreNumbers));
        IO.println("Total of second array: " + total);
    }
}
