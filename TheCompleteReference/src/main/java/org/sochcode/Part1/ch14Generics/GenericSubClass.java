package org.sochcode.Part1.ch14Generics;

// A non-generic class can be the superclass
// of a generic subclass.

// A non-generic class.
class NonGeneric
{
    int num;

    NonGeneric(int i)
    {
        num = i;
    }

    int getnum() {
        return num;
    }
}

// A generic subclass.
class Generic<T> extends NonGeneric
{
    T ob;    // declare an object of type T

    // Pass the constructor a reference to
    // an object of type T.
    Generic(T o, int i)
    {
        super(i);
        ob = o;
    }

    // Return ob.
    T getOb()
    {
        return ob;
    }
}

// Create a Generic object
class GenericSubClass
{
    public static void main(String[] args)
    {
        // Create a Generic object for String.
        Generic<String> w = new Generic<>("Hello", 47);

        System.out.print(w.getOb() + " ");
        System.out.println(w.getnum());
    }
}
