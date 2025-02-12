package org.sochtech.variablesdatatypesandoperators;

public class FloatingPointTypes
{
    public static void main(String[] args)
    {
        // width of int = 32 (4 bytes).
        int myIntValue = 5 / 3;

        // width of float = 32 (4 bytes)
        float myFloatValue = 5F / 3F;

        // width of double = 64 (8 bytes)
        double myDoubleValue = 5D / 3D;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numPounds = 250D;
        double convertedKilograms = numPounds * 0.453_592_37;

        System.out.println("Mass in kilograms = " + convertedKilograms);
    }
}
