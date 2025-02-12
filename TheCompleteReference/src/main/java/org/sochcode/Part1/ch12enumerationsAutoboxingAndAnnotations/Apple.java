package org.sochcode.Part1.ch12enumerationsAutoboxingAndAnnotations;

// An enumeration of apple varieties
// Use an enum constructor, instance variable, and method.
enum Apple
{
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;    // price of each apple

    // Constructor
    Apple (int p) { price = p; }

    // Overloaded constructor
    Apple() { price = -1; }

    public int getPrice()
    {
        return price;
    }
}
