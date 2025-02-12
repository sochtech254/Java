package org.sochcode.Part2.ch31regularExpressionsAndOtherPackages;

// Use find() to find multiple subsequences.
import java.util.regex.*;

class MultipleFindSubsequences
{
    public static void main(String[] args)
    {
        Pattern pat = Pattern.compile("test");
        Matcher mat = pat.matcher("test 1 2 3 test");

        while (mat.find())
        {
            System.out.println("test found at index " + mat.start());
        }
    }
}
