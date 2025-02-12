package org.sochcode.Part1.ch17switchExpressionRecordsAndOtherTopics;

// Demonstrate indentation in a text block.
class TextBlockDemo
{
    public static void main(String[] args)
    {
        String str = """
                     Text blocks support strings that
                     span two or more lines nad preserve
                         indentation. They reduce the
                             tedium associated with the
                         entry of long or complicated
                     strings into a program.     \s
                     \s""";

        System.out.println(str);
    }
}
