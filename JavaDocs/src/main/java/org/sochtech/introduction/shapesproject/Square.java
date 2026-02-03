package org.sochtech.introduction.shapesproject;

public final class Square implements Shape {
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public double surface() {
        return width * width;
    }
}
