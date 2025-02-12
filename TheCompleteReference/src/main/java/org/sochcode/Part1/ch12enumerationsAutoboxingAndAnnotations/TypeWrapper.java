package org.sochcode.Part1.ch12enumerationsAutoboxingAndAnnotations;

// Demonstrate a type wrapper.
class TypeWrapper
{
    public static void main(String[] args)
    {
        Integer iOb = Integer.valueOf(100);

        int i = iOb.intValue();

        System.out.println(i + " " + iOb);    // displays 100 100
    }
}
