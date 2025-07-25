package file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo
{
    public static void main(String[] args) throws IOException
    {
        FileWriter fileWriter = new FileWriter("abc.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // writing a string
        bufferedWriter.write("AbcD");

        // adding new line
        bufferedWriter.newLine();

        // writing an array of characters
        char[] ch = new char[]{'a', 'b', 'c'};
        bufferedWriter.write(ch);

        // adding single character
        bufferedWriter.newLine();
        bufferedWriter.write("a");
        bufferedWriter.close();
    }
}
