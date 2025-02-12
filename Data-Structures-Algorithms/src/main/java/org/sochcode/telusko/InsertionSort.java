package org.sochcode.telusko;

class InsertionSort
{
    public static void main(String[] args)
    {
        int[] arr = {6, 5, 2, 8, 9, 4};

        System.out.println("Before sorting:");
        for (int num : arr)
            System.out.print(num + " ");

        for (int i = 1; i < arr.length; i++)
        {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        System.out.println();
        System.out.println("After sorting:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
