package org.sochcode.amigoscode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class ClassOverrideHashcodeAndEqualsMethods
{

    public static void main(String[] args)
    {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("African Diamond"));

        System.out.println(map.get(new Person("Jamila")));
    }

    static class Person
    {
        String name;

        public Person(String name)
        {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + '}';
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Person person = (Person) obj;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    record Diamond(String name) {}
}
