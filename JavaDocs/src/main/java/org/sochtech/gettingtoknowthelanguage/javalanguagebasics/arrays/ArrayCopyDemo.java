package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.arrays;

public class ArrayCopyDemo {
    static void main() {
        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto"
        };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            IO.print(coffee + " ");
        }
    }
}
