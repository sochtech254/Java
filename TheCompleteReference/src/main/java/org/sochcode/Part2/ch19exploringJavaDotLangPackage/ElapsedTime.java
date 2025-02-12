package org.sochcode.Part2.ch19exploringJavaDotLangPackage;

// TIming program execution.
class ElapsedTime
{
    public static void main(String[] args)
    {
        long start, end;

        System.out.println("Timing a for loop from 0 to 100,000,000");

        // time a for loop from 0 to 100,000,000
        start = System.currentTimeMillis();    // get starting time
        for (long i = 0; i < 100000000; i++) ;
        end = System.currentTimeMillis();    // get ending time

        System.out.println("Elapsed time: " + (end - start));
    }
}
