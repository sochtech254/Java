package org.sochcode;

class Practice
{

    static int linearsearch(int[] nums, int targ)
    {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == targ)
                return i;
        }

        return -1;
    }
    public static void main(String[] args)
    {
        int[] nums = {9, 1, 3, 2, 5, 4, 6, 7, 8, 0};
        int targ = 8;

        int result = linearsearch(nums, targ);
        if (result == -1)
            System.out.println("Target not found!");
        else
            System.out.println("Target found at index " + result);

    }
}
