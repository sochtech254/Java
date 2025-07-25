public class DoWhileLoop
{
    public static void main(String[] args)
    {
        int counter = 1;

        do {
            System.out.println(counter + " I love Java.");
            counter++;
        } while (counter < 0);

        System.out.println("After the loop.");

        do
            System.out.println("Hey hi");
        while (true);
    }



}
