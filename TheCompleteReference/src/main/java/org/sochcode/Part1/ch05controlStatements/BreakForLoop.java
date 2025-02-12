package org.sochcode.Part1.ch05controlStatements;

// Using break to exit a loop.
class BreakForLoop
{
    public static void main(String[] args)
    {
        for (int i = 0; i < 100; i++)
        {
            if (1 == 10)  break;    // terminate loop if i is 10
            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
    }
}
