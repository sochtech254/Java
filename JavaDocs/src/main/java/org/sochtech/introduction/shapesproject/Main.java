package org.sochtech.introduction.shapesproject;

public class Main {
    static void main(String... args) {
        Circle circle = new Circle(1.0d);
        Square square = new Square(1.0d);
        IO.println("Circle: " + circle.surface());
        IO.println("Square: " + square.surface());
    }
}
