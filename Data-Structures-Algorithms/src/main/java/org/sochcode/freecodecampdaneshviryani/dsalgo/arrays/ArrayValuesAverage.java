package org.sochcode.freecodecampdaneshviryani.dsalgo.arrays;

class ArrayValuesAverage
{
    public static void findAvg()
    {
        int[] arr = {1, 2, 3, 4, 5};
        double sum = 0.0;
        for (int j : arr) sum += j;
        System.out.println("The average  is " + sum / arr.length);
    }
    public static void main(String[] args)
    {
        ArrayValuesAverage.findAvg();
    }
}
