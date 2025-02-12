package org.sochcode.Part1.ch14Generics;

// Overriding a generic method in a generic class.
class Gen5<T>
{
    T ob;    // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Gen5(T o)
    {
        ob = o;
    }

    // Return ob.
    T getOb()
    {
        System.out.print("Gen5's getOb(): ");
        return ob;
    }
}

// A subclass of Gen5 that overrides getOb().
class Gen6<T> extends Gen5<T>
{
    Gen6(T o)
    {
        super(o);
    }

    // Override getOb().
    T getOb()
    {
        System.out.print("Gen6's getOb(): ");
        return ob;
    }
}

// Demonstrate generic method override.
class GenericMethodOverride
{
    public static void main(String[] args)
    {
        // Create a Gen5 object for Integers.
        Gen5<Integer> iOb = new Gen5<>(88);

        // Create a Gen6 object for Integers.
        Gen6<Integer> iOb2 = new Gen6<>(99);

        // Create a Gen6 object for Strings.
        Gen6<String> strOb2 = new Gen6<>("Generics test");

        System.out.println(iOb.getOb());
        System.out.println(iOb2.getOb());
        System.out.println(strOb2.getOb());
    }
}
