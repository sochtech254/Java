package org.sochcode.Part1.ch15lambdaExpressions;

// Implement a simple class factory using a constructor reference.

interface MyFUn<R, T>
{
    R func(T n);
}

// A simple generic class.
class MYClass<T>
{
    private final T val;

    // A constructor that takes an argument.
    MYClass(T v)
    {
        val = v;
    }

    // The default constructor. This constructor
    // is NOT used by this program.
    MYClass()
    {
        val = null;
    }

    // ...

    T getVal()
    {
        return val;
    }
}

// A simple non-generic class.
class MYClass2
{
    String str;

    // A constructor that takes an argument.
    MYClass2(String s)
    {
        str = s;
    }

    // The default constructor. This
    // constructor is NOT used by this program.
    MYClass2()
    {
        str = "";
    }

    // ...

    String getVal()
    {
        return str;
    }
}
class ConstructorReferenceDemo2
{
    // A factory method for class objects. The class must
    // have a constructor that takes one parameter of type T.
    // R specifies the type of object being created.
    static <R, T> R myClassFactory(MyFUn<R, T> cons, T v)
    {
        return cons.func(v);
    }

    public static void main(String[] args)
    {
        // Create a reference to a MyClass constructor.
        // In this case, new refers to the constructor that
        // takes an argument.
        MyFUn<MYClass<Double>, Double> myClassCons = MYClass<Double> :: new;

        // Create an instance of MyClass by use of the factory method.
        MYClass<Double> mc = myClassFactory(myClassCons, 100.1);

        // Use the instance of MyClass just created.
        System.out.println("val in mc is " + mc.getVal() );

        // Now, create a different class by use of myClassFactory().
        MyFUn<MYClass2, String> myClassCons2 = MYClass2 :: new;

        // Create an instance of MyClass2 by use of the factory method.
        MYClass2 mc2 = myClassFactory(myClassCons2, "Lambda");

        // Use the instance of MyClass just created.
        System.out.println("str in mc2 is " + mc2.getVal( ));
    }
}
