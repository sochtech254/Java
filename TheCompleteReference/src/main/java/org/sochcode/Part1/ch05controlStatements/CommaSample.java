package org.sochcode.Part1.ch05controlStatements;

// Using the comma
class CommaSample
{
    public static void main(String[] args)
    {
        int a, b;

        for (a = 1, b = 4; a < b; a++, b--)
        {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

    }
}
