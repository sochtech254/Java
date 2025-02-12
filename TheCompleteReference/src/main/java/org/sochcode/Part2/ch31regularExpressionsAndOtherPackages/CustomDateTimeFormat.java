package org.sochcode.Part2.ch31regularExpressionsAndOtherPackages;

// Create a custom date and time format.
import java.time.*;
import java.time.format.DateTimeFormatter;

class CustomDateTimeFormat
{
    public static void main(String[] args)
    {
        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println(curDateTime.format(
                DateTimeFormatter.ofPattern("MMMM d',' yyyy h':'mm a")
        ));
    }
}
