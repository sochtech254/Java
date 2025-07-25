public class MethodParameters
{
    public static void main(String[] args)
    {
        displayName("John", 4);
    }

    public static void displayName(String name, int counter)
    {
        for (int i = 1; i <= counter; i++)
        {
            System.out.println(i + " : " + name);
        }
    }
}
