package Part2.ch18stringHandling;

// Construct one string from another.
class MakeString
{
    public static void main(String[] args)
    {
        char[] c = {'J', 'a', 'v', 'a'};
        String s1 = new String(c);
        String s2 = s1;

        System.out.println(s1);
        System.out.println(s2);

    }
}
