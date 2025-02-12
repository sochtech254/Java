package org.sochcode.Part2.ch30theStreamApi;

// Map one stream to another.
import java.util.*;
import java.util.stream.*;

class StreamMappingDemo
{
    public static void main(String[] args)
    {
        // A list of double values.
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(18.);
        myList.add(10.);
        myList.add(24.);
        myList.add(17.);
        myList.add(5.);

        // Map the square root of the elements in myList to a new stream.
        Stream<Double> sqrtRootStrm = myList.stream().map(Math::sqrt);

        // Find the product of the square roots.
        double productOfSqrRoots = sqrtRootStrm.reduce(1.0, (a, b) -> a * b);

        System.out.println("Product of square roots is " + productOfSqrRoots);
    }
}
