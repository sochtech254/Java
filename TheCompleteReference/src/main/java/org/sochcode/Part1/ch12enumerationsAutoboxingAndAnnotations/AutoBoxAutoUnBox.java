package org.sochcode.Part1.ch12enumerationsAutoboxingAndAnnotations;

// Demonstrate autoboxing/unboxing
class AutoBoxAutoUnBox
{
    public static void main(String[] args)
    {
        Integer iOb = 100;    // autobox an int

        int i = iOb;    // auto-unbox

        System.out.println(i + " " + iOb);    // displays 100  100
    }
}
