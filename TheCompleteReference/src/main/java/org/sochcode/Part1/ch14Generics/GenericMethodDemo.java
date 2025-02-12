package org.sochcode.Part1.ch14Generics;

// Demonstrate a simple generic method.
class GenericMethodDemo
{
    // Determine if an object is in an array.
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y)
    {
        for (V v : y) if (x.equals(v)) return true;

        return false;
    }

    public static void main(String[] args)
    {
        // Use isIn() on Integers.
        Integer[] nums = { 1, 2, 3, 4, 5 };

        if (isIn(2, nums))
            System.out.println("2 is in nums");

        if (!isIn(7, nums))
            System.out.println("7 is not in nums");

        System.out.println();

        // Use isIn() on Strings.
        String[] strs = { "one", "two", "three", "four", "five" };

        if (isIn("two", strs))
            System.out.println("two is in strs");

        if (!isIn("seven", strs))
            System.out.println("seven is not in strs");

        // oops! Won't compile! Types must be compatible.
        // if(ifIn("two", nums))
        //     System.out.println("two is in strs");
    }
}
