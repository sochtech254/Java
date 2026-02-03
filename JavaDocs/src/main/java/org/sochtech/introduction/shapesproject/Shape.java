package org.sochtech.introduction.shapesproject;

public sealed interface Shape
        permits Square, Circle {
    double surface();
}
