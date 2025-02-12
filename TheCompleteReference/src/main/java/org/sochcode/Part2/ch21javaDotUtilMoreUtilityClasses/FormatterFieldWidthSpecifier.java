package org.sochcode.Part2.ch21javaDotUtilMoreUtilityClasses;

// Demonstrate a field-width specifier.
import java.util.*;

class FormatterFieldWidthSpecifier
{
    public static void main(String[] args)
    {
        Formatter fmt = new Formatter();
        fmt.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);

        System.out.println(fmt);
        fmt.close();
    }
}
