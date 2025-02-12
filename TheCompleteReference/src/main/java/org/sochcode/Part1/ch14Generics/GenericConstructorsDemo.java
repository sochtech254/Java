package org.sochcode.Part1.ch14Generics;

// Use a generic constructor.
class GenCons
{
    private final double val;

    <T extends Number> GenCons(T arg)
    {
        val = arg.doubleValue();
    }

    void showVal()
    {
        System.out.println("val: " + val);
    }
}
class GenericConstructorsDemo
{
    public static void main(String[] args)
    {
        GenCons test = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);

        test.showVal();
        test2.showVal();
    }
}
