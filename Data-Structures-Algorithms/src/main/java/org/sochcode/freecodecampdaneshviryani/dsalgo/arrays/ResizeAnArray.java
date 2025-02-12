package org.sochcode.freecodecampdaneshviryani.dsalgo.arrays;

public class ResizeAnArray
{
    public void printArray(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public int[] resize(int[] arr, int capacity)
    {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++)
        {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
    public static void main(String[] args)
    {
        ResizeAnArray raa = new ResizeAnArray();
        int[] original = new int[] {5, 1, 2, 9, 10};
        System.out.println("The size of original array - " +original.length);
        original = raa.resize(original, 10);
        System.out.println("The size of original array after resize - " + original.length);
    }
}
