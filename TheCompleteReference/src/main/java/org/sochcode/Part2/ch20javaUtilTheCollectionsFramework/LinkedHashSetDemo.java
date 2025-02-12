package Part2.ch20javaUtilTheCollectionsFramework;

// Demonstrate LinkedHashSet
import java.util.*;

class LinkedHashSetDemo
{
    public static void main(String[] args)
    {
        // Create a LinkedHashSet
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // Add elements to the Linked hash set
        lhs.add("Beta");
        lhs.add("Alpha");
        lhs.add("Eta");
        lhs.add("Gamma");
        lhs.add("Epsilon");
        lhs.add("Omega");

        System.out.println(lhs);
    }
}
