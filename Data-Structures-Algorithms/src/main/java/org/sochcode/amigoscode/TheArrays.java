package org.sochcode.amigoscode;

import java.util.Arrays;

class TheArrays
{
    public static void main(String[] args)
    {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));

        System.out.println();

        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        System.out.println();

        colors[2] = "yellow";

        System.out.println(Arrays.toString(colors));

        System.out.println();

        // Use for-each type to loop through the array
        for (String color : colors) System.out.println(color);

        System.out.println();

        // Use for loop to loop through the array
        for (int i = colors.length-1; i >= 0; i--)
            System.out.println(colors[i]);

        System.out.println();

        // Use a stream to loop through the array.
        Arrays.stream(colors).forEach(System.out :: println);

    }
}
