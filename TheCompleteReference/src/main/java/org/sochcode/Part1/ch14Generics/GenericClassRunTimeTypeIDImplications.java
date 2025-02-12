package org.sochcode.Part1.ch14Generics;

// Use the instanceof operator with a generic class hierarchy.
class Gen3<T>
{
    T ob;

    Gen3(T o)
    {
        ob = o;
    }

    // Return ob.
    T getOb()
    {
        return ob;
    }
}

// A subclass of Gen3
class Gen4<T> extends Gen3<T>
{
    Gen4(T o)
    {
        super(o);
    }
}

// Demonstrate run-time type ID implications of generic
// class hierarchy.
class GenericClassRunTimeTypeIDImplications
{
    public static void main(String[] args)
    {
        // Create a Gen object for Integers.
        Gen3<Integer> iOb = new Gen3<>(88);

        // Create a Gen4 object for Integers.
        Gen4<Integer> iOb2 = new Gen4<>(99);

        // Create a Gen4 object for strings.
        Gen4<String> strOb2 = new Gen4<>("Generics Test");

        // See if iOb2 is some form of Gen4
        if (iOb2 instanceof Gen4<?>)
            System.out.println("iOb2 is instance of Gen4");

        // See if iOb2 is some form of Gen3.
        if (iOb2 instanceof Gen3<?>)
            System.out.println("iOb2 is instance of Gen3");

        System.out.println();

        // See if strOb2 is a Gen4.
        if (strOb2 instanceof Gen4<?>)
            System.out.println("strOb2 is instance of Gen4");

        // See if strOb2 is a Gen3
        if (strOb2 instanceof Gen3<?>)
            System.out.println("strOb2 is instance of Gen3");

        System.out.println();

        // See if iOb is an instance of Gen4, which it is not.
        if (iOb instanceof Gen4<?>)
            System.out.println("iOb is instance of Gen4");

        // See if iOb is an instance of Gen3, which it is.
        if (iOb instanceof Gen3<?>)
            System.out.println("iOb is instance of Gen3");
    }
}
