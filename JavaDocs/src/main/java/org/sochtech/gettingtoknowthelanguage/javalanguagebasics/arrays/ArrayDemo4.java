package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.arrays;

public class ArrayDemo4 {
    static void main() {
        // Enhanced for loop (for-each)
        int[] scores = {95, 87, 92, 78, 85};
        IO.println("Test scores using enhanced for loop:");
        for (int score : scores) {
            IO.println("Score: " + score);
        }
    }
}
