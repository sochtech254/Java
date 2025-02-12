package org.sochcode.Part1.ch08Inheritance;

// Demonstrate when constructors are executed.

// Create a super class
class A2
{
    A2()
    {
        System.out.println("Inside A2's constructor.");
    }
}

// Create a subclass by extending class A2
class B2 extends A2
{
    B2()
    {
        System.out.println("Inside B2's constructor.");
    }
}

// Create another subclass by extending B2.
class C2 extends B2
{
    C2()
    {
        System.out.println("Inside C2's constructor.");
    }
}
class ConstructorsExecuted
{
    public static void main(String[] args)
    {
        C2 c = new C2();
    }
}
