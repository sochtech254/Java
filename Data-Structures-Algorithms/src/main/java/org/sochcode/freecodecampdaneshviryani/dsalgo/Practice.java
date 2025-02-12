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

    void myAray()
    {
        int[] aray = new  int[5];
        aray[0] = 1;
        aray[1] = 2;
        aray[2] = 3;
        aray[3] = 4;
        aray[4] = 5;
        printArray(aray);
    }
    public static void main(String[] args)
    {
        Practice practice = new Practice();
        practice.myAray();
    }
}
