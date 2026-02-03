package org.sochtech.gettingtoknowthelanguage.javalanguagebasics;

import java.util.List;

public class VarDemo {
    static void main() {
        var list = List.of("one", "two", "three", "four");
        for (var element : list) {
            IO.println(element);
        }
    }
}
