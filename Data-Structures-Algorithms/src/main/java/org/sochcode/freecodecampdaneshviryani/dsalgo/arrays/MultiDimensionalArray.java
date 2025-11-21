package org.sochcode.freecodecampdaneshviryani.dsalgo.arrays;

public class MultiDimensionalArray
{
    public static void main(String[] args)
    {
        MultiDimensionalArray.printArray(3);
    }

    public static void printArray(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                System.out.println("i = " + i + " j = " + j);
            }
            System.out.println("End of inner loop");
        }
        System.out.println("End of outer loop");
    }
}
