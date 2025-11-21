package org.sochcode.freecodecampdaneshviryani.dsalgo;

public class Practice
{
    void printArray(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    void arrayDemo()
    {
        int[] arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        printArray(arr);
        System.out.println(arr.length);
        System.out.println(arr[arr.length - 1]);
    }
    public static void main(String[] args)
    {
        Practice p = new Practice();
        p.arrayDemo();
    }
}
