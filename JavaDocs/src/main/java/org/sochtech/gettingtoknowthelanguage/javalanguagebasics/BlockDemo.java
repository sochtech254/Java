package org.sochtech.gettingtoknowthelanguage.javalanguagebasics;

public class BlockDemo {
    static void main() {
        boolean condition = true;
        if (condition) {    // begin block 1
            IO.println("Condition is true.");
        }    // end block one
        else {
            IO.println("Condition is false.");
        }    // end block 2
    }
}
