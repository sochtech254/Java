package org.sochtech.variablesdatatypesandoperators;

public class SimpleTypes
{
    public static void main(String[] args)
    {
        // int has a width of 32
        int intMinValue = -2_147_483_648;
        int intMaxValue = 2_147_483_647;
        int myTotal = (intMinValue / 2) + intMaxValue;
        System.out.println("myTotal = " + myTotal);

        // byte has a width of 8
        byte byteMinValue = -128;
        byte byteMaxValue = 127;
        byte myNewByteValue = (byte) (((byte) (byteMaxValue / 2)) * ((byte) (byteMinValue / 2)));
        System.out.println("myNewByteValue = " + myNewByteValue);

        // short has a width of 16
        short shortMinValue = -32768;
        short shortMaxValue = 32767;
        System.out.println(shortMaxValue + shortMinValue);

        // long has a width of 64
        long longMinValue = -9_223_372_036_854_775_808L;
        long longMaxValue = 9_223_372_036_854_775_807L;
        System.out.println(longMaxValue + longMinValue);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
    }
}
