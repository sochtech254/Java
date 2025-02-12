package org.sochcode.Part1.ch15lambdaExpressions;

// Demonstrate a constructor reference with a generic class.
// Func is now a generic functional interface.
interface Func<T>
{
    MyClasss<T> fun(T n);
}

class MyClasss<T>
{
    private final T val;

    // A constructor that takes an argument.
    MyClasss(T v)
    {
        val = v;
    }

    // This is the default constructor.
    MyClasss( )
    {
        val = null;
    }

    // ...

    T getVal()
    {
        return val;
    }
}

class ConstructorReferenceWIthAGenericClass
{
    public static void main(String[] args)
    {
        // Create a reference to the MyClasss<T> constructor.
        Func<Integer> myClassCons = MyClasss :: new;

        // Create an instance of MyClasss<T> via that constructor reference.
        MyClasss<Integer> mc = myClassCons.fun(100);

        // Use the instance of MyClasss<T> just created.
        System.out.println("val in mc is " + mc.getVal( ));
    }
}
