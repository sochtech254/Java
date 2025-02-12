package Part2.ch18stringHandling;

// Using concatenation to prevent long lines
class Concatenation
{
    public static void main(String[] args)
    {
        String longStr = "This could have been " +
                         "a very long line that would have " +
                         "wrapped around. But string concatenation " +
                         "prevents this.";

        System.out.println(longStr);
    }
}
