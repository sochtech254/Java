package org.sochcode.Part2.ch21javaDotUtilMoreUtilityClasses;

// Use relative indexes to simplify the
// creation of a custom time and date format.
import java.util.*;

class UseRelativeIndexesWithFormatterDemo
{
    public static void main(String[] args)
    {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();

        fmt.format("Today is day %te of %<tB, %<tY", cal);
        System.out.println(fmt);
        fmt.close();
    }
}
