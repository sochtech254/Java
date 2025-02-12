package org.sochcode.Part1.ch03dataTypesVariablesAndArrays;

// Compute the area of a circle
class DoubleArea
{
    public static void main(String[] args)
    {
        double pi, r, a;
        r = 10.8;   // radius of circle
        pi = 3.14128;    // pi, approximately
        a = pi * r * r;     // compute area

        System.out.println("Area of circle is " + a);
    }
}
