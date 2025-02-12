package org.sochcode.Part1.ch05controlStatements;

// The target of a loop can be empty
class WhileNoBody
{
    public static void main(String[] args)
    {
        int i, j;

        i = 100;
        j = 200;

        // find midpoint between i and j
        while (++i < --j);    // no body in this loop

        System.out.println("Mid point is " + j);
    }
}
