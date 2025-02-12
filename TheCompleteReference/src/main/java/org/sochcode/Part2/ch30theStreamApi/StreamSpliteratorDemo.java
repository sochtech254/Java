package org.sochcode.Part2.ch30theStreamApi;

// Use a Spliterator.
import java.util.*;
import java.util.stream.*;

class StreamSpliteratorDemo
{
    public static void main(String[] args)
    {
        // Create a list of Strings.
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Alpha");
        myList.add("Beta");
        myList.add("Gamma");
        myList.add("Delta");
        myList.add("Phi");
        myList.add("Omega");

        // Obtain a stream to the array list.
        Stream<String> myStream = myList.stream();

        // Obtain an iterator to the stream.
        Spliterator<String> splititr = myStream.spliterator();

        // Iterate the elements of the stream.
        while (splititr.tryAdvance(System.out::println));
    }
}
