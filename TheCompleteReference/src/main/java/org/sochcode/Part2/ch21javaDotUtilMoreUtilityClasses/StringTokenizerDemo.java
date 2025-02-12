package org.sochcode.Part2.ch21javaDotUtilMoreUtilityClasses;

// Demonstrate StringTokenizer.
import java.util.StringTokenizer;
class StringTokenizerDemo
{
    static String in = "title=Java: The Complete Reference;" +
            "author=Schildt;" +
            "publisher=McGraw Hill;" +
            "copyright=2022";

    public static void main(String[] args)
    {
        StringTokenizer st = new StringTokenizer(in, "=;");

        while (st.hasMoreTokens())
        {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}
