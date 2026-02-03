package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.arrays;

public class ArrayLength {

    static void displayBidimensionalArray(String[][] strings) {
        for (int arrayIndex = 0; arrayIndex < strings.length; arrayIndex++) {
            for (int index = 0; index < strings[arrayIndex].length; index++) {
                IO.print(strings[arrayIndex][index] + " ");
            }

            IO.println();
        }
    }

    static void main() {
        String[][] strings = {
                {"one"},
                {"Maria", "Jennifer", "Patricia"},
                {"James", "Michael"},
                {"Washington", "London", "Paris", "Berlin", "Tokyo"}
        };

        ArrayLength.displayBidimensionalArray(strings);
    }
}
