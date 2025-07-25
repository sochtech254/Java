package org.example.ch04thejavalanguage;

public class IfDemo1
{
    public static void main(String[] args)
    {
        int j = 0;
        if (j < 0)
        {
            System.out.println("j is less than 0! Resetting");
            j = 0;
        } else
        {
            System.out.println("j is positive or 0. Continuing");
        }
    }
}
