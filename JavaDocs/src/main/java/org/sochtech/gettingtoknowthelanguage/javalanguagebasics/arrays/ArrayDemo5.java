package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.arrays;

public class ArrayDemo5 {
    static void main() {
        // Different data types
        double[] temperatures = {20.5, 25.0, 18.3, 30.2};
        boolean[] flags = {true, false, true, false, true};
        char[] letters = {'a', 'b', 'c', 'd', 'e'};

        IO.println("");
        IO.println("Temperatures:");
        for (double temp : temperatures) {
            IO.println(temp + "°C");
        }

        IO.println("");
        IO.println("Boolean flags:");
        for (int i = 0; i < flags.length; i++) {
            IO.println("Flag " + i + ": " + flags[i]);
        }

        IO.println("");
        IO.println("Character letters:");
        for (char letter : letters) {
            IO.println("Letter: " + letter);
        }
    }
}
