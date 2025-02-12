package org.sochcode.amigoscode;

import java.util.LinkedList;
import java.util.ListIterator;

class WorkingWithQueues
{
    public static void main(String[] args)
    {
//        Queue<Person> supermarket = new LinkedList<>();
//        supermarket.add(new Person("Alex", 21));
//        supermarket.add(new Person("Mariam", 18));
//        supermarket.add(new Person("Ali", 40));
//
//        System.out.println(supermarket.size());
//        System.out.println(supermarket.peek());
//        System.out.println(supermarket.poll());
//        System.out.println(supermarket.size());
//        System.out.println(supermarket.peek());
//

        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Alex", 21));
        linkedList.add(new Person("Mariam", 18));
        linkedList.add(new Person("Ali", 40));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext())
        {
            System.out.println(personListIterator.next());
        }

        System.out.println();

        while (personListIterator.hasPrevious())
        {
            System.out.println(personListIterator.previous());
        }
    }

    static record Person(String name, int age) {}
}
