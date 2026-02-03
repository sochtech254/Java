package org.sochtech.gettingtoknowthelanguage.javalanguagebasics;

public class UnaryDemo {
    static void main() {
        int result = +1;
        // result is now 1
        IO.println(result);

        result--;
        // result is now 0
        IO.println(result);

        result++;
        // result is now 1
        IO.println(result);

        result = - result;
        // result is now -1
        IO.println(result);

        boolean success = false;
        // false
        IO.println(success);
        // true
        IO.println(!success);
    }
}
