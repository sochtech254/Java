public class MethodsReturn
{
    public static void main(String[] args)
    {
        int a = maxValue(5, 6);
        System.out.println("The maximum value is " + a);
    }
    public static int maxValue(int number1, int number2)
    {
        if (number1 > number2)
            return number1;
        else
            return number2;
    }
}
