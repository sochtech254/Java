package org.sochcode.Part2.ch31regularExpressionsAndOtherPackages;

// Use wildcard and quantifier.
import java.util.regex.*;

class WildCardAndQuantifier
{
    public static void main(String[] args)
    {
        Pattern pat = Pattern.compile("e.+d");
        Matcher mat = pat.matcher("extend cup end table");

        while (mat.find())
            System.out.println("Match: " + mat.group());
    }
}
