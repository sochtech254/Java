package org.sochcode.amigoscode;

import java.util.ArrayList;
import java.util.List;

class WorkingWithLists
{
    public static void main(String[] args)
    {
        List colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        colors.add(8);
        colors.add(22);
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));

        for (Object color : colors)
            System.out.println(color);

        System.out.println();

        colors.forEach(System.out :: println);

        System.out.println();

        for (int i = 0; i < colors.size(); i++)
            System.out.println(colors.get(i));

        List<String> colorsUnmodifiable = List.of("blue", "pink", "yellow");
        System.out.println(colorsUnmodifiable);

    }
}
