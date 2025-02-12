package org.sochcode.amigoscode;

public class UserDefinedClass
{
    public static void main(String[] args)
    {
        Cat.meow();
    }

    static class Cat
    {
        static String name;
        static void meow()
        {
            System.out.println(name + ": meow...");
        }
    }
}
