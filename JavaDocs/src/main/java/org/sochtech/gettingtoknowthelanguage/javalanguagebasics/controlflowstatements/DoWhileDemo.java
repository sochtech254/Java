package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.controlflowstatements;

public class DoWhileDemo {
    static void main() {
        int count =1;
        do {
            IO.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}
