package org.sochcode.Part1.ch14Generics;

// Use a wildcard.
class Stats1<T extends Number>
{
    T[] nums;    // array of Number or subclass

    // Pass the constructor a reference to
    // an array of type Number or subclass.
    Stats1(T[] o)
    {
        nums = o;
    }

    // Return type double in all cases.
    double average()
    {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();

        return sum / nums.length;
    }

    // Determine if two averages are the same.
    // Notice the use of the wildcard.
    boolean isSameAvg(Stats1<?> ob)
    {
        if (average() == ob.average())
            return true;

        return false;
    }
}

// Demonstrate wildcard
class WildCardDemo
{
    public static void main(String[] args)
    {
        Integer[] inums = { 1, 2, 3, 4, 5 };
        Stats1<Integer> iOb = new Stats1<>(inums);
        double v = iOb.average();
        System.out.println("iOb average is " + v);

        Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Stats1<Double> dOb = new Stats1<>(dnums);
        double w = dOb.average();
        System.out.println("dOb average is " + w);

        Float[] fnums = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
        Stats1<Float> fOb = new Stats1<>(fnums);
        double x = fOb.average();
        System.out.println("fOb average is " + x);

        // See which arrays have the same average.
        System.out.print("Averages of iOb and dOb ");
        if (iOb.isSameAvg(dOb))
            System.out.println("are the same.");
        else
            System.out.println("differ.");

        System.out.print("Averages of iOb and fOb ");
        if (iOb.isSameAvg(fOb))
            System.out.println("are the same.");
        else
            System.out.println("differ");
    }
}
