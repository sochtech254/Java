package org.sochtech.gettingtoknowthelanguage.javalanguagebasics.arrays;

public class MultiDimArrayDemo {
    static void main() {
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };

        // Mr. Smith
        IO.println(names[0][0] + names[1][0]);

        // Ms. Jones
        IO.println(names[0][2] + names[1][1]);
    }
}
