package file;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo
{
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader("abc.txt");
        /*
        int i = fileReader.read();
        while (i != -1)
        {
            System.out.println((char) i);
            i = fileReader.read();
        }*/

        /*char[] c = new char[100];
        fileReader.read(c);
        System.out.println(c);*/

        char[] c = new char[100];
        fileReader.read(c, 2, 5);
        System.out.println(c);

        for (char i : c)
        {
            System.out.println("char : " + i);
        }

        fileReader.close();
    }
}
