package org.sochcode.Part1.ch04Operators;

// Demonstrate ?
class TernaryOperator
{
    public static void main(String[] args)
    {
        int i, k;

        i = 10;
        k = i < 0 ? -i : i;    // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);

        i = -10;
        k = i < 0 ? -i : i;    // get absolute value of i
        System.out.print("Absolute value of ");
        System.out.println(i + " is " + k);
    }
}
