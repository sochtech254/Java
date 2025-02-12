package org.sochcode.amigoscode;

import java.util.HashSet;
import java.util.Set;

class WorkingWithSets
{
    public static void main(String[] args)
    {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.add(new Ball("red"));

        balls.forEach(System.out :: println);
    }

    static record Ball(String color) {}
}
