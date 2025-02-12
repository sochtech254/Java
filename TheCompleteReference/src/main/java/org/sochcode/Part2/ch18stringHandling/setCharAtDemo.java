package Part2.ch18stringHandling;

// Demonstrate charAt() and setCharAt().
class setCharAtDemo
{
    public static void main(String[] args)
    {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Before before = " + sb);
        System.out.println("charAt(1) before = " + sb.charAt(1));

        sb.setCharAt(1, 'i');
        sb.setLength(2);
        System.out.println("buffer after = " + sb);
        System.out.println("charAt(1) after = " + sb.charAt(1));
    }
}
