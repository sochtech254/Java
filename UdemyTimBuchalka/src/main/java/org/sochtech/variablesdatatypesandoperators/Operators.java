package org.sochtech.variablesdatatypesandoperators;

public class Operators
{
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 89;
        if (topScore != 100)
            System.out.println("You got the highScore!");

        if (topScore >= 70)
            System.out.println("Attained the pass mark!");

        if (topScore <= 39)
            System.out.println("Failed!");

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater tan second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true.");

        boolean isCar = false;
        if (isCar = true)
            System.out.println("This is not supposed to happen!");

        boolean wasCar = true ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        double myFirstValue = 20D;
        double mySecondValue = 80D;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("myTotal = " + myTotal);
        double theRemainder = myTotal % 40;
        System.out.println("Remainder is " + theRemainder);
        if (theRemainder <= 20)
            System.out.println("Total was over the limit");
    }
}
