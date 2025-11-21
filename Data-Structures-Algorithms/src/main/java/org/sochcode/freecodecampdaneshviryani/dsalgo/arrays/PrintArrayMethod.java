package org.sochcode.freecodecampdaneshviryani.dsalgo.arrays;

public class PrintArrayMethod
{
    void printArray(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        PrintArrayMethod printArrayMethod = new PrintArrayMethod();
        printArrayMethod.printArray(new int[] {1, 2, 3, 4, 5});
    }
}
