package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.arrays;

public class ArrayDemo3 {
    static void main() {
        // Try creating your own arrays!
        double[] prices = {9.99, 15.50, 7.25};
        IO.println("");
        IO.println("Prices:");
        for (double price : prices) {
            IO.println("$" + price);
        }
    }
}
