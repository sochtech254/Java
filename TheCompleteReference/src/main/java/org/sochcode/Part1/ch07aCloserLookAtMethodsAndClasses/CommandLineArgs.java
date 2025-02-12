package org.sochcode.Part1.ch07aCloserLookAtMethodsAndClasses;

// Display all command-line arguments
class CommandLineArgs
{
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++)
            System.out.println("args[" + i + "]: " + args[i]);
    }
}
