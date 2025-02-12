package org.sochcode.Part2.ch31regularExpressionsAndOtherPackages;

// Use a quantifier.
import java.util.regex.*;

class UsingAQuantifier
{
    public static void main(String[] args)
    {
        Pattern pat = Pattern.compile("W+");
        Matcher mat = pat.matcher("W WW WWW");

        while (mat.find())
            System.out.println("Match: " + mat.group());
    }
}
