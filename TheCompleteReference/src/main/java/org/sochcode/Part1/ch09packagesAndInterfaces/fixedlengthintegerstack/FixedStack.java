package org.sochcode.Part1.ch09packagesAndInterfaces.fixedlengthintegerstack;

// An implementation of IntStack that uses fixed storage
public class FixedStack implements IntStack
{
    private final int[] stck;
    private int tos;

    // allocate and initialize stack
    public FixedStack(int size)
    {
        stck = new int[size];
        tos = -1;
    }

    // Push an item onto te stack
    @Override
    public void push(int item)
    {
        if (tos == stck.length-1)    // use length memeber
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    // Pop an item from the stack
    @Override
    public int pop()
    {
        if (tos < 0)
        {
            System.out.println("Stack underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
