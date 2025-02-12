package org.sochtech.controlflowstatements;

public class WhileAndDoWhileLoops
{
    public static void main(String[] args)
    {
        int count = 1;
        while (count != 6)
        {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println();

        count = 1;
        while (true)
        {
            if (count == 6)
                break;

            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println();

        count = 1;
        do
        {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        System.out.println();
        boolean isEven = isEvenNumber(5);
        System.out.println(isEven);

        System.out.println();
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber)
        {
            number++;
            if (!isEvenNumber(number))
                continue;

            System.out.println("Even number " + number);

            evenNumbersFound++;
            if (evenNumbersFound >= 5)
                break;
        }

        System.out.println("Total even numbers found = " + evenNumbersFound);
    }

    private static boolean isEvenNumber(int number)
    {
        return number % 2 == 0;
    }
}
