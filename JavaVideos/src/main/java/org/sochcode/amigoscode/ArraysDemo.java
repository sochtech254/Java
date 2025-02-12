package org.sochcode.amigoscode;

import java.util.Arrays;

public class ArraysDemo
{
    public static void main(String[] args)
    {
        // Arrays
        // Allow us to store multiple values in one variable
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 33;
        numbers[2] = 6;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int[] numbers2 = {0, 5, 6, 8, 9};
        System.out.println(Arrays.toString(numbers2));
        numbers2[1] = 55;
        System.out.println(Arrays.toString(numbers2));
        System.out.println(numbers2.length);

        // Arrays null values
        // The default value for primitive arrays is 0
        int[] numbers3 = new  int[3];
        numbers3[0] = 2;
        // Instead of zeros you can choose what to fill your array with
        Arrays.fill(numbers3, -1);
        System.out.println(Arrays.toString(numbers3));

        // The default value for reference arrays is null
        String[] names = new String[3];
        Arrays.fill(names, "foo");
        names[1] = "Jamila";
        System.out.println(Arrays.toString(names));
    }
}
