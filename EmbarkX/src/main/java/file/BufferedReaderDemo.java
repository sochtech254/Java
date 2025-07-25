package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo
{
    public static void main(String[] args) throws IOException
    {
        FileReader fileReader = new FileReader("abc.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // read character by character
        /*int i = bufferedReader.read();
        while (i != -1)
        {
            System.out.println((char) i);
            i = bufferedReader.read();
        }*/

        // read line by line
        /*String s = bufferedReader.readLine();
        while (s != null)
        {
            System.out.println(s);
            s = bufferedReader.readLine();
        }*/

        // Reading with the help of array
        /*char[] c = new char[100];
        bufferedReader.read(c);
        System.out.println(c);*/

        char[] c = new char[100];
        bufferedReader.read(c, 4, 5);
        System.out.println(c);

        bufferedReader.close();
    }
}
