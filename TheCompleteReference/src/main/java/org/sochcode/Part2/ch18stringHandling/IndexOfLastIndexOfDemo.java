package Part2.ch18stringHandling;

// Demonstrate indexOf() and lastIndexOf()
class IndexOfLastIndexOfDemo
{
    public static void main(String[] args)
    {
        String s = "Now is the time for all good men " +
                   "to come to the aid of their country.";

        System.out.println(s);
        System.out.println("IndexOf(t) = " + s.indexOf('t'));
        System.out.println("lastIndexOf(t) = " + s.lastIndexOf('t'));
        System.out.println("IndexOf(the) = " + s.indexOf("the"));
        System.out.println("lastIndexOf(the) = " + s.lastIndexOf("the"));
        System.out.println("IndexOf(t, 10) = " + s.indexOf('t', 10));
        System.out.println("lastIndexOf(t, 60) = " + s.lastIndexOf('t', 60));
        System.out.println("indexOf(the, 10) = " + s.indexOf("the", 10));
        System.out.println("lastIndex(the, 60) = " + s.lastIndexOf("the", 60));

    }
}
