package org.sochcode.Part2.ch31regularExpressionsAndOtherPackages;

// Demonstrate DateTimeFormatter.
import java.time.*;
import java.time.format.*;

class DateTimeFormatter
{
    public static void main(String[] args)
    {
        LocalDate curDate = LocalDate.now();
        System.out.println(curDate.format(
                java.time.format.DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        LocalTime curTime = LocalTime.now();
        System.out.println(curTime.format(
                java.time.format.DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)
        ));
    }
}
