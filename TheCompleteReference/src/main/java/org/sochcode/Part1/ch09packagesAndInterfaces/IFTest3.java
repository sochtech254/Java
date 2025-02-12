package org.sochcode.Part1.ch09packagesAndInterfaces;

import org.sochcode.Part1.ch09packagesAndInterfaces.fixedlengthintegerstack.FixedStack;
import org.sochcode.Part1.ch09packagesAndInterfaces.fixedlengthintegerstack.IntStack;
import org.sochcode.Part1.ch09packagesAndInterfaces.growablelengthintegerstack.DynStack;

/*
The following class uses both the FixedStack and DynStack implementations. It does so through an interface reference.
This means that calls to push( ) and pop( ) are resolved at run time rather than at compile time.
Create an interface variable and
access stacks through it
 */
class IFTest3
{
    public static void main(String[] args)
    {
        IntStack mystack;    // create an interface reference variable
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);

        mystack = (IntStack) ds;    // load dynamic stack
        // push some numbers onto the stack
        for (int i = 0; i < 12; i++) mystack.push(i);

        mystack = fs;    // load fixed stack
        for (int i = 0; i < 8; i++) mystack.push(i);

        mystack = (IntStack) ds;
        System.out.println("Values in dynamic stack:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack.pop());

        mystack = fs;
        System.out.println("Values infixed stack:");
        for (int i = 0; i < 8; i++)
            System.out.println(mystack.pop());
    }
}
