package org.sochcode.Part1.ch05controlStatements;

// Loops may be nested.
class NestedLoops
{
    public static void main(String[] args)
    {
        int i, j;

        for (i = 0; i < 10; i++)
        {
            for (j = i; j < 10; j++)
                System.out.print(".");
            System.out.println();
        }
    }
}
