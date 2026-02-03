package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.controlflowstatements;

public class SwitchMultipleCaseLabelsDemo {
    static void main() {
        int month = 2;
        int year = 2021;
        int numDays = 0;

        switch (month) {
            case 1: case 3: case 5:   // January March May
            case 7: case 8: case 10:  // July August October
            case 12:
                numDays = 31;
                break;
            case 4: case 6:   // April June
            case 9: case 11:  // September November
                numDays = 30;
                break;
            case 2: // February
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    numDays = 29;
                    IO.println("Leap year. February has " + numDays + " days");
                }

                else {
                    numDays = 28;
                    IO.println("Not a leap year. February has " + numDays + " days");
                }
                break;
            default:
                IO.println("Invalid month.");
                break;
        }

    }
}
