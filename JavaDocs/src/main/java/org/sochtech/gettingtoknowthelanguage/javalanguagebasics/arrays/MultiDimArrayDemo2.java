package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.arrays;

public class MultiDimArrayDemo2 {
    static void main() {
        // Try a different shaped matrix
        String[][] schedule = {
                {"Math", "Science", "English"},
                {"History", "Art", "PE"},
                {"Music", "Computer", "Study Hall"}
        };

        IO.println("");
        IO.println("Class Schedule:");
        String[] periods = {"Period 1", "Period 2", "Period 3"};
        for (int day = 0; day < schedule.length; day++) {
            IO.println("Day " + (day + 1) + ":");
            for (int period = 0; period < schedule[day].length; period++) {
                IO.println(" " + periods[period] + ": " + schedule[day][period]);
            }
        }
    }
}
