package org.sochcode.amigoscode;

import java.awt.*;

public class ReferenceTypes
{
    public static void main(String[] args)
    {
        // Reference Types
        Point pointA = new Point(10, 10);
        System.out.println("pointA = " + pointA);
        pointA.move(10, 11);
        System.out.println("pointA = " + pointA);
    }
}
