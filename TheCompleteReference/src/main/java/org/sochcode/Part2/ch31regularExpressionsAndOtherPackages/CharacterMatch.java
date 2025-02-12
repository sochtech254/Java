package org.sochcode.Part2.ch31regularExpressionsAndOtherPackages;

// Use a character class.
import java.util.regex.*;

class CharacterMatch
{
    public static void main(String[] args)
    {
        // Match lowercase words.
        Pattern pat = Pattern.compile("[a-z]+");
        Matcher mat = pat.matcher("this is a test.");

        while (mat.find())
            System.out.println("Match: " + mat.group());
    }
}
