package org.sochcode.Part1.ch12enumerationsAutoboxingAndAnnotations;

class EnumConstInstVarAndMeth
{
    public static void main(String[] args)
    {
        Apple ap;

        // Display price of Winesap.
        System.out.println("Winesap costs " + Apple.Winesap.getPrice() + " cents.\n");

        // Display all apples and prices.
        System.out.println("All apple prices:");
        for (Apple a : Apple.values())
            System.out.println(a + " costs " + a.getPrice() + " cents.");


    }
}
