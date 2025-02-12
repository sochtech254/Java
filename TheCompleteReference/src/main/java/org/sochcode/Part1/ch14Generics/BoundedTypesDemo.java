package org.sochcode.Part1.ch14Generics;

// In this version of Stats, the type argument for
// T must be either Number, or a class derived
// from Number.
class Stats<T extends Number>
{
    T[] nums;    // array of Number or subclass

    // Pass the constructor a reference to
    // an array of type Number or subclass
    Stats(T[] o)
    {
        nums = o;
    }

    // Return type double in all cases.
    double average()
    {
        double sum = 0.0;

        for (T num : nums) sum += num.doubleValue();

        return sum / nums.length;
    }
}

// Demonstrate Stats.
class BoundedTypesDemo
{
    public static void main(String[] args)
    {
        Integer[] inums = { 1, 2, 3, 4, 5 };
        Stats<Integer> iOb = new Stats<>(inums);
        double v = iOb.average();
        System.out.println("iOb average is " + v);

        Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats<Double> dOb = new Stats<>(dnums);
        double w = dOb.average();
        System.out.println("dOb average is " + w);

        // This won't compile because String is not a
        // subclass of Number.
        // String[] strs = {"1", "2", "3", "4", "5" };
        // Stats<String> strob = new Stats<String>(strs);

        // double x = strob.average();
        // System.out.println("strob average is " + v)
    }
}
