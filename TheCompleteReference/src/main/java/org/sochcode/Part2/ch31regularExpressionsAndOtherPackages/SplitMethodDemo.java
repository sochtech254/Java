package org.sochcode.Part2.ch31regularExpressionsAndOtherPackages;

// Use split().
import java.util.regex.*;

class SplitMethodDemo
{
    public static void main(String[] args)
    {
        // Match lowercase words.
        Pattern pat = Pattern.compile("[ , . ! ]");

        String[] strs = pat.split("one two,alpha9 12!done.");

        for (String str : strs) System.out.println("Next token: " + str);
    }
}
