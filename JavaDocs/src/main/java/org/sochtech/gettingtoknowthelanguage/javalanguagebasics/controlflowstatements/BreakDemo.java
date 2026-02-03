package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.controlflowstatements;

public class BreakDemo {
    static void main() {
        int[] arrayOfInts =
                {
                        32, 87, 3, 589,
                        12, 1076, 2000,
                        8, 622, 127
                };
        int searchFor = 12;
        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchFor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            IO.println("Found " + searchFor + " at index " + i);
        } else {
            IO.println(searchFor + " not in the array");
        }
    }
}
