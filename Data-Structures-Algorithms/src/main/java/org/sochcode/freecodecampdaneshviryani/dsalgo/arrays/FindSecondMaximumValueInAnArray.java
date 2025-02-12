package org.sochcode.freecodecampdaneshviryani.dsalgo.arrays;

public class FindSecondMaximumValueInAnArray
{
    int findSecondMax(int[] arr)
    {
        // edge
        if (arr == null || arr.length == 0)
        {
            throw new IllegalArgumentException("Invalid input");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > max) {
                secondMax = max;
                max = j;
            } else if (j > secondMax && j != max) {
                secondMax = j;
            }
        }

        return secondMax;
    }

    public static void main(String[] args)
    {
        int[] arr = {12, 34, 2, 34, 33, 1};
        FindSecondMaximumValueInAnArray fsmvia = new FindSecondMaximumValueInAnArray();
        System.out.println(fsmvia.findSecondMax(arr));
    }
}
