package org.sochcode.telusko;

class LinearSearch
{
    public static int linearsearch(int[] arr, int x)
    {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
    public static void main(String[] args)
    {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 8;

        int result = linearsearch(arr, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);
    }
}
