package org.sochcode.freecodecampdaneshviryani.dsalgo.arrays;

public class MoveZerosToTheEnd
{
    public void printArray(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public void arrayDemo()
    {
        int[] arr = {8, 1, 0, 2, 1, 0, 3};
        printArray(arr);
        moveZeros(arr, arr.length);
        printArray(arr);
    }

    public void moveZeros(int[] arr, int n)
    {
        int j = 0;

        for (int i = 0; i < n; i++)
        {
            if (arr[i] != 0 && arr[j] == 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0)
            {
                j++;
            }
        }
    }
    public static void main(String[] args)
    {
        MoveZerosToTheEnd arrUtil = new MoveZerosToTheEnd();
        arrUtil.arrayDemo();
    }
}
