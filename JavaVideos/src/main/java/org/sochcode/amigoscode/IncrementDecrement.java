package org.sochcode.amigoscode;

public class IncrementDecrement
{
    public static void main(String[] args)
    {
        int numberOne = 0;
        System.out.println(numberOne++);    // prints numberOne and then increments
        System.out.println(numberOne);    // prints the value after increment

        System.out.println();
        // To increment immediately and then print the value after increment
        // use as below
        int numberTwo = 0;
        System.out.println(++numberTwo);
        System.out.println(numberTwo);

        // Decrement works the same as increment
        int numberThree = 0;
        System.out.println(numberThree--);
        System.out.println(numberThree);

        System.out.println(--numberThree);

        /*
        * x += y is x = x + y
        * x -= y is x = x - y
        * x *= y is x = x * y
        * x /= y is x = x / y
        * x %= y is x = x % y
        * x ^= y is x = x ^ y
        * */
    }
}
