package org.sochcode.Part2.ch30theStreamApi;

// Demonstrate the use of a combiner with reduce()
import java.util.*;

class StreamCombinerWithReduceMethodDemo
{
    public static void main(String[] args)
    {
        // This is now a list of double values.
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(7.0);
        myList.add(18.);
        myList.add(10.);
        myList.add(24.);
        myList.add(17.);
        myList.add(5.);

        double productOfSqrRoots = myList.parallelStream().reduce(
                                        1.0,
                                           (a, b) -> a * Math.sqrt(b),
                                           (a, b) -> a * b
        );

        System.out.println("Product of square roots: " + productOfSqrRoots);
    }
}
