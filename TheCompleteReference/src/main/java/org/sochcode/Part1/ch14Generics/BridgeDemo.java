package org.sochcode.Part1.ch14Generics;

// A situation that creates a bridge method.
class Gen7<T>
{
    T ob;    // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen7(T o)
    {
        ob = o;
    }

    // Return ob.
    T getOb()
    {
        return ob;
    }
}

// A subclass of Gen7.
class Gen8 extends Gen7<String>
{
    Gen8(String o)
    {
        super(o);
    }

    // A String-specific override of getOb().
    String getOb()
    {
        System.out.print("You called String getOb(): ");
        return ob;
    }
}
class BridgeDemo
{
    public static void main(String[] args)
    {
        // Create a Gen8 object for Strings.
        Gen8 strOb2 = new Gen8("Generics Test");

        System.out.println(strOb2.getOb());
    }
}
