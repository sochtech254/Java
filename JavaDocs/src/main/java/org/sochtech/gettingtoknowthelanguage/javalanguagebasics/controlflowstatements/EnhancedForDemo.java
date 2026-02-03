package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.controlflowstatements;

public class EnhancedForDemo {
    static void main() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int item : numbers) {
            IO.println("Count is: " + item);
        }
    }
}
