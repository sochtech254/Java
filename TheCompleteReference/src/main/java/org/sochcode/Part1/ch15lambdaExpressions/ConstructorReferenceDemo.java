package org.sochcode.Part1.ch15lambdaExpressions;

// Demonstrate a Constructor reference.

// MyFun is a functional interface whose method returns
// a MyClass reference.
interface MyFun
{
    MyClas func(int n);
}

class MyClas {
    private int val;

    // This constructor takes an argument.
    MyClas(int v)
    {
        val = v;
    }

    // This is the default constructor.
    MyClas()
    {
        val = 0;
    }

    // ...


    public int getVal()
    {
        return val;
    }
}

class ConstructorReferenceDemo
{
    public static void main(String[] args)
    {
        // Create a reference to the MyClas constructor.
        // Because func() in MyFun takes an argument, new
        // refers to the parameterized constructor in MyClas,
        // not the default constructor.
        MyFun myClasCons = MyClas :: new;

        // Create an instance of MyClas via that constructor reference.
        MyClas mc = myClasCons.func(100);

        // Use that instance of MyClas just created.
        System.out.println("val in mc is " + mc.getVal());
    }
}
