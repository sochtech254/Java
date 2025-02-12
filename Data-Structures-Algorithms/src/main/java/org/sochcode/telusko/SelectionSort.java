package org.sochcode.telusko;

class SelectionSort
{
    public static void main(String[] args)
    {
        int[] nums = {6, 5, 2, 8, 9, 4};
        int temp;
        int minIndex;

        System.out.println("Before sorting:");
        for (int num : nums)
            System.out.print(num + " ");

        for (int i = 0; i < nums.length - 1; i++)
        {
            minIndex = i;
            for (int j = i + 1; j < nums.length; j++)
            {
                if (nums[minIndex] > nums[j])
                    minIndex = j;
            }

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            System.out.println();
            for (int num : nums)
            {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.println("After sorting:");
        for (int num : nums)
            System.out.print(num + " ");
    }
}
