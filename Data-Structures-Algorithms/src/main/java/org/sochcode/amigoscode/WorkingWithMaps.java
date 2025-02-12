package org.sochcode.amigoscode;

import java.util.HashMap;
import java.util.Map;

class WorkingWithMaps
{
    public static void main(String[] args)
    {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Mariam"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.entrySet().forEach(System.out :: println);

        map.forEach((key, value) -> System.out.println(key + " - " + value));

        System.out.println(map.getOrDefault(4, new Person("Default")));   // sets null to default
        System.out.println(map.values());
    }

    record Person(String name) {}
}
