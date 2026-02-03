package org.sochtech.gettingtoknowthelanguage.javalanguagebasics;

public class PrePostDemo {
    static void main() {
        int i = 3;
        i++;
        // prints 4
        IO.println(i);
        ++i;
        // prints 5
        IO.println(i);
        // prints 6
        IO.println(++i);
        // prints 6
        IO.println(i++);
        // prints 7
        IO.println(i);
    }
}
