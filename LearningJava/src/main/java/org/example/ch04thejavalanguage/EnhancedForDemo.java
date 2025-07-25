package org.example.ch04thejavalanguage;

import java.util.ArrayList;

public class EnhancedForDemo
{
    public static void main(String[] args)
    {
        int[] arrayOfInts = new int[] { 1, 2, 3, 4, 5 };

        int total = 0;
        for (int i : arrayOfInts)
        {
            System.out.println(i);
            total += i;
        }
        System.out.println("Total is " + total);

        ArrayList<String> list =  new ArrayList<>();
        list.add("foo");
        list.add("bar");

        for (String s : list)
            System.out.println(s);
    }
}
