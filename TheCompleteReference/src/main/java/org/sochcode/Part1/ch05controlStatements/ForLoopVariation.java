package org.sochcode.Part1.ch05controlStatements;

// Parts of the for loop can be empty.
class ForLoopVariation
{
    public static void main(String[] args)
    {
        int i;
        boolean done = false;

        i = 0;
        for (; !done; )
        {
            System.out.println("i is " + i);
            if (i == 10)  done = true;
            i++;
        }

    }
}
