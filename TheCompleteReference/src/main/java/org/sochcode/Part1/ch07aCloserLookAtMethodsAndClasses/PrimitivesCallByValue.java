package org.sochcode.Part1.ch07aCloserLookAtMethodsAndClasses;

// Primitive types are passed by value
class Test1
{
    void meth(int i, int j)
    {
        i *= 2;
        i /= 2;
    }
}
class PrimitivesCallByValue
{
    public static void main(String[] args)
    {
        Test1 ob = new Test1();

        int a = 15, b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }
}
