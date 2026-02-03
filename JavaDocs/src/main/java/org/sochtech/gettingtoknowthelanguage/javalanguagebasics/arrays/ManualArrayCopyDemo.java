package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.arrays;

import java.util.Arrays;

public class ManualArrayCopyDemo {
    static void main() {
        // Array copying
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        // Manual copy
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        IO.println("Original: " + Arrays.toString(original));
        IO.println("Copy: " + Arrays.toString(copy));
    }
}
