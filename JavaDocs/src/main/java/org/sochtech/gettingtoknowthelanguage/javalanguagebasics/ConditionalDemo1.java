package org.sochtech.gettingtoknowthelanguage.javalanguagebasics;

public class ConditionalDemo1 {
    static void main() {
        int value1 = 1;
        int value2 = 2;

        if ((value1 == 1) && (value2 == 2))
            IO.println("value1 is 1 AND value2 is 2");
        if ((value1 == 1) || (value2 == 1))
            IO.println("value1 is 1 OR value2 is 1");
    }
}
