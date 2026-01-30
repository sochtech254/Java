package org.sochtech.introduction;

public class MyFirstJavaApp {
    static void main() {
        IO.println("Hello World!");
        var name = IO.readln("What is your name? ");
        IO.println("Hello " + name);
    }
}
