package org.sochcode.Part1.ch13ioTryWithResourcesAndOtherTopics;

// A generic interface example.

// A Min/Max interface.
interface MinMax<T extends  Comparable<T>>
{
    T min();
    T max();
}

// Now, implement MinMax
class MyClass<T extends Comparable<T>> implements MinMax<T>
{
    T[] vals;

    MyClass(T[] o)
    {
        vals = o;
    }

    // Return the minimum value in vals.
    @Override
    public T min()
    {
        T v = vals[0];

        for (T val : vals) if (val.compareTo(v) < 0) v = val;

        return v;
    }

    // Return the maximum value in vals.
    @Override
    public T max()
    {
        T v = vals[0];

        for (int i = 1; i < vals.length; i++)
            if (vals[i].compareTo(v) > 0) v = vals[i];

        return v;
    }
}
class GenericInterfaceDemo
{
    public static void main(String[] args)
    {
        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iOb = new MyClass<>(inums);
        MyClass<Character> cOb = new MyClass<>(chs);

        System.out.println("Max value in inums: " + iOb.max());
        System.out.println("Min value in inums: " + iOb.min());
        System.out.println("Max value in chs: " + cOb.max());
        System.out.println("Min value in chs: " + cOb.min());
    }
}
