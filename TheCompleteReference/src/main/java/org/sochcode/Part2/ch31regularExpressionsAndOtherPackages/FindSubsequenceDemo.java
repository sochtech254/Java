package org.sochcode.Part2.ch31regularExpressionsAndOtherPackages;

// Use find() to find a subsequence.
import java.util.regex.*;
class FindSubsequenceDemo
{
    public static void main(String[] args)
    {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java SE");
        System.out.println("Looking for Java in Java SE.");

        if (mat.find()) System.out.println("subsequence found");
        else System.out.println("No Match");
    }
}
