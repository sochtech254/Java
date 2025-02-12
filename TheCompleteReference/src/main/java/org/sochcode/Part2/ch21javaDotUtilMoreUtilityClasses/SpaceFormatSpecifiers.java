package org.sochcode.Part2.ch21javaDotUtilMoreUtilityClasses;

// Demonstrate the space format specifiers.
import java.util.*;

class SpaceFormatSpecifiers
{
    public static void main(String[] args)
    {
        Formatter fmt = new Formatter();

        fmt.format("% d", -100);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("% d", 100);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("% d", -200);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("% d", 200);
        System.out.println(fmt);
        fmt.close();
    }
}
