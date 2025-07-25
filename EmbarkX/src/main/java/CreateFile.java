import java.io.File;

public class CreateFile
{
    public static void main(String[] args)
    {
        File textFile = new File("abc.txt");
        System.out.println(textFile.exists());

        String currentDirectory = System.getProperty("user.dir");
        System.out.println("The current working directory is : " + currentDirectory);

        File srcFolder = new File("src");
        System.out.println(srcFolder.exists());
    }
}
