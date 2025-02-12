package org.sochcode.Part1.ch12enumerationsAutoboxingAndAnnotations;

// Use the built-in enumeration methods.

class BuiltInEnumMethods
{
    public static void main(String[] args)
    {
        Apple ap;

        System.out.println("Here are all Apple constants:");

        // use values()
        // Apple[] allapples = Apple.values();
        // for (Apple a : allapples)
        for (Apple a : Apple.values())
            System.out.println(a);

        System.out.println();

        // use valueOf()
        ap = Apple.valueOf("Winesap");
        System.out.println("ap contains " + ap);
    }
}
