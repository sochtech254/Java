package org.example.ch04thejavalanguage;

public class WhileDemo
{
    public static void main(String[] args)
    {
        int count = 10;
        while (count > 0)
        {
            System.out.println("Counting down: " + count);
            count--;
        }
        System.out.println("Done");
    }
}
