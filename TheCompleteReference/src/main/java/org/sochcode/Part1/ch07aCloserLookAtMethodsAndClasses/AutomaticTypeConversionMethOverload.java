package org.sochcode.Part1.ch07aCloserLookAtMethodsAndClasses;

// Automatic type conversions apply to overloading.
class MethOverloadDemo
{
    void test()
    {
        System.out.println("No parameters");
    }

    // Overload test for two integer parameters
    void test(int a, int b)
    {
        System.out.println("a and b: " + a + " " + b);
    }

    // Overload test for a double parameter
    void test(double a)
    {
        System.out.println("Inside test(double) a: " + a);
    }
}
class AutomaticTypeConversionMethOverload
{
    public static void main(String[] args)
    {
        MethOverloadDemo ob = new MethOverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);    // this will invoke test(double)
        ob.test(123.2);    // this will invoke test(double)
    }
}
