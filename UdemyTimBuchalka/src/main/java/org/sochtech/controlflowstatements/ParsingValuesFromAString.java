package org.sochtech.controlflowstatements;

public class ParsingValuesFromAString
{
    public static void main(String[] args)
    {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        System.out.println("***********************");
        String numAsString = "2018.125";
        System.out.println("numAsString = " + numAsString);

        double num = Double.parseDouble(numAsString);
        System.out.println("num = " + num);
        numAsString += 1;
        num += 1;
        System.out.println("numAsString = " + numAsString);
        System.out.println("num = " + num);
    }
}
