package org.sochcode.telusko;

class StepsTakenByBothLinearAndBinarySearch
{
    static int linearsearch(int[] arr, int targ)
    {
        int steps = 0;
        for (int i = 0; i < arr.length; i++)
        {
            steps++;
            if (arr[i] == targ)
            {
                System.out.println("Steps taken by linear search " + steps);
                return i;
            }
        }
        System.out.println("Steps taken by linear search " + steps);
        return -1;
    }

    static int binarysearch(int[] arr, int targ)
    {
        int steps = 0;
        int low = 0, high = arr.length -1;

        while (low <= high)
        {
            steps++;
            int mid = low + (high - low) / 2;

            if (arr[mid] == targ)
            {
                System.out.println("Steps taken by binary search " + steps);
                return mid;
            }

            if (arr[mid] < targ)
                low = mid + 1;

            else
                high = mid - 1;
        }

        System.out.println("Steps taken by binary search " + steps);
        return -1;
    }

    public static void main(String[] args)
    {
        int[] arr = {2, 3, 4, 10, 40};
        int targ = 10;

        int result1 = linearsearch(arr, targ);
        int result2 = binarysearch(arr, targ);

        if (result1 == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at " + "index " + result1);

        if (result2 == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at " + "index " + result2);


    }
}
