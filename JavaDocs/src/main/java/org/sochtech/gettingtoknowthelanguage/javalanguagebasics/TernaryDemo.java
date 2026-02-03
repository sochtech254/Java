package org.sochtech.gettingtoknowthelanguage.javalanguagebasics;

public class TernaryDemo {
    static void main() {
        int value1 = 1;
        int value2 = 2;
        int result;

        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        IO.println(result);
    }
}
