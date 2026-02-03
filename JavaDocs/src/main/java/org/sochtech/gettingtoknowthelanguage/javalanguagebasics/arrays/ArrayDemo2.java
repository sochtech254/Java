package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.arrays;

public class ArrayDemo2 {
    static void main() {
        // Array initialization shorthand
        String[] fruits = {"apple", "banana", "cherry", "date"};
        IO.println("");

        IO.println("Fruits array:");
        for (int i = 0; i < fruits.length; i++) {
            IO.println(i + ": " + fruits[i]);
        }
    }
}
