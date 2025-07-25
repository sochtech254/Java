package org.sochtech.namingconventionspackagesstaticandfinal;

public class StaticTestMain
{

    private static final int multiplier = 7;

    public static void main(String[] args)
    {
        StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        System.out.println("***************************");
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }

    private static int multiply(int number)
    {
        return number * multiplier;
    }
}
