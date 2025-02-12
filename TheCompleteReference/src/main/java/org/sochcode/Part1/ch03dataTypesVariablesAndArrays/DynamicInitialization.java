package org.sochcode.Part1.ch03dataTypesVariablesAndArrays;

// Demonstrate dynamic initialization
class DynamicInitialization
{
    public static void main(String[] args)
    {
        double a = 3.0, b = 4.0;

        // c is dynamically initialized
        double c = Math.sqrt(a * a + b * b);

        System.out.println("Hypotenuse is " + c);
    }
}
