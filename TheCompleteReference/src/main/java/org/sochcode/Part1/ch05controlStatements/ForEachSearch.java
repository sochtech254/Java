package org.sochcode.Part1.ch05controlStatements;

// Search an array using for-each style for.
class ForEachSearch
{
    public static void main(String[] args)
    {
        int[] nums = { 6, 8, 3, 7, 5, 6, 1, 4 };
        int val = 5;
        boolean found = false;

        // use for-each style for to search nums for val
        for (int x : nums)
        {
            if (x == val)
            {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Value found!");
    }
}
