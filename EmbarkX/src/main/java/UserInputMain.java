import java.util.Scanner;

public class UserInputMain
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
//        String firstStr = scanner.nextLine();
//        System.out.println("You entered: " + firstStr);
//
//        int a = scanner.nextInt();
//        System.out.println("You entered: " + a);
        System.out.println("Hello, what's your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("You are " + age + " years old!");
    }
}
