package org.sochcode.Part1.ch03dataTypesVariablesAndArrays;

class IterateOverOneDimensionalAutoArray
{
    public static void main(String[] args)
    {
        int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int i;
        for (i = 0; i < 12; i++)
            System.out.println("Days of month: " + month_days[i]);
    }
}
