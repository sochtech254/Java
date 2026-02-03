package org.sochtech.gettingtoknowthelanguage.javalanguagebasics;

public class BitDemo {
    static void main() {
        int bitmask = 0x000F;
        int val = 0x2222;
        // prints "2"
        IO.println(val & bitmask);
    }
}
